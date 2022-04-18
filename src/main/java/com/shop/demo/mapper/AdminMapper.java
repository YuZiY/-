package com.shop.demo.mapper;

import java.util.List;

import com.shop.demo.entity.Admin;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.transaction.annotation.Transactional;

public interface AdminMapper {
    /**
     * 用户名登录
     * 
     * @apiNote 通过用户名和密码登录
     * @return List<Admin>
     */
    @Select("select * from admin where adminName=#{adminName} and adminPassword=#{adminPassword}")
    List<Admin> loginByName(Admin admin);

    /**
     * 手机号登陆
     * 
     * @apiNote 通过手机号和密码登陆
     * @return List<Admin>
     */
    @Select("select * from admin where adminPhone=#{adminPhone} and adminPassword=#{adminPassword}")
    List<Admin> loginByPhone(Admin admin);

    /**
     * 通过用户名注册
     * 
     * @apiNote 通过用户名和密码注册
     * @return
     */
    @Update("insert into admin(adminName,adminPassword) values(#{adminName},#{adminPassword})")
    @Transactional
    void registerByName(Admin admin);

    /**
     * 通过手机号注册
     * 
     * @apiNote 通过手机号和密码注册
     * @return
     */
    @Select("insert into admin(adminPhone,adminPassword) values(#{adminPhone},#{adminPassword})")
    @Transactional
    void registerByPhone(Admin admin);

    /**
     * 重置密码
     * 
     * @apiNote 通过用户的id重置密码为123456
     * @param admin
     */
    @Update("update admin set adminPassword=123456 where adminId=#{adminId}")
    @Transactional
    void resetPassword(Admin admin);

    /**
     * 修改用户信息
     * 
     * @apiNote 通过用户的id修改用户信息
     * @param admin
     */
    @Update("update admin set adminName=#{adminName},adminPassword=#{adminPassword},adminPhone=#{adminPhone},adminAddress=#{adminAddress} where adminId=#{adminId}")
    @Transactional
    void updateAdminById(Admin admin);

    @Delete("delete from admin where adminId=#{adminId}")
    void deleteAdminById(int adminId);

    /**
     * 通过用户名或手机号查找用户信息
     * 
     * @apiNote 通过用户名或手机号查找用户信息
     * @param admin
     */
    @Select("select * from admin where adminName=#{adminName} or adminPhone=#{adminPhone}")
    List<Admin> findAdminByNameOrPhone(Admin admin);
}
