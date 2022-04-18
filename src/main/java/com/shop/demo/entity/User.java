package com.shop.demo.entity;

import lombok.Data;

/**
 * 用户
 */
@Data
public class User {
    /**
     * 用户id
     * 
     * @mock 1
     */
    private int userId;
    /**
     * 用户账号
     * 
     * @mock 2642940081
     */
    private int userAccount;
    /**
     * 用户名称
     * 
     * @mock 老学
     * 
     */
    private String userName;
    /**
     * 用户密码
     * 
     * @mock 123456
     * 
     */
    private String userPassword;
    /**
     * 用户手机号
     * 
     * @mock 13888888888
     * 
     */
    private String userPhone;
    /**
     * 用户收货地址
     * 
     * @mock 北京市朝阳区
     */
    private String userAddress;
}
