package com.shop.demo.mapper;

import java.util.List;

import com.shop.demo.entity.Admin;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.transaction.annotation.Transactional;

public interface AdminMapper extends Mapper {
    /**
     * 登录
     * 
     * @return
     */
    @Select("select * from admin where adminId = #{adminId} and adminPassword = #{adminPassword}")
    List<Admin> login();

    /**
     * 注册
     * 
     * @return
     */
    @Update("INSERT INTO admin(adminAccount,name,adminPassword,adminPhone,adminAddress) VALUES (#{adminAccount},#{name},#{adminPassword},#{adminPhone},#{adminAddress})")
    @Transactional
    List<Admin> register();

    /**
     * 重置密码
     * 
     * @param admin
     */
    @Update("update admin set adminPassword=#{adminAccount} where adminPhone=#{adminPhone}")
    @Transactional
    void resetPassword(Admin admin);

    @Update("INSERT INTO admin(adminAccount,name,adminPassword,adminPhone,adminAddress) VALUES (#{adminAccount},#{name},#{adminPassword},#{adminPhone},#{adminAddress})")
    @Transactional
    void save(Admin admin);

    @Update("update admin set adminAccount=#{adminAccount} where adminId=#{adminId}")
    @Transactional
    void updateAdminById(Admin admin);

    @Delete("delete from admin where adminId=#{adminId}")
    void deleteAdminById(int adminId);

    @Select("select * from admin where adminId=#{adminId}")
    List<Admin> findAdminById(int admiId);
}
