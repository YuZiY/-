package com.shop.demo.mapper;

import java.util.List;

import com.shop.demo.entity.User;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.transaction.annotation.Transactional;

public interface UserMapper {
    /**
     * 登录
     * 
     * @return
     */
    @Select("select * from user where userId = #{userId} and userPassword = #{userPassword}")
    List<User> login();

    /**
     * 通过用户名注册
     * 
     * @return
     */
    @Update("insert into user(userName,userPassword) values(#{userName},#{userPassword})")
    @Transactional
    void registerByName(User user);

    /**
     * 通过手机号注册
     * 
     * @return
     */
    @Update("insert into user(userPhone,userPassword) values(#{userPhone},#{userPassword})")
    @Transactional
    void registerByPhone(User user);

    /**
     * 修改密码
     * 
     * @return
     */
    @Update("update user set userPassword = #{userPassword} where userId = #{userId}")
    @Transactional
    void resetPassword(User user);

    /**
     * 修改用户信息
     * 
     * @return
     */
    @Update("update user set userAccount = #{userAccount},name=#{name},userPassword=#{userPassword},userPhone=#{userPhone},userAddress=#{userAddress} where userId = #{userId}")
    @Transactional
    void updateUserById(User user);

    /**
     * 查询用户信息
     * 
     * @return
     */
    @Select("select * from user")
    List<User> findAllUser();

    /**
     * 删除用户
     * 
     * @return
     */
    @Delete("delete from user where userId=#{userId}")
    @Transactional
    void deleteUserById(int userId);

}
