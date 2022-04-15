package com.shop.demo.entity;

import lombok.Data;

@Data
public class User {
    /**
     * 用户id
     */
    private int userId;
    /**
     * 用户账号
     */
    private int userAccount;
    /**
     * 用户名称
     */
    private String userName;
    /**
     * 用户密码
     */
    private String userPassword;
    /**
     * 用户手机号
     */
    private String userPhone;
    /**
     * 用户收货地址
     */
    private String userAddress;
}
