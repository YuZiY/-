package com.shop.demo.entity;

import lombok.Data;

@Data
public class Admin {
    /**
     * 管理员id
     */
    private int adminId;
    /**
     * 管理员账号
     */
    private int adminAccount;
    /**
     * 管理员昵称
     */
    private String name;
    /**
     * 管理员密码
     */
    private String adminPassword;
    /**
     * 管理员手机
     */
    private String adminPhone;
    /**
     * 管理员地址
     */
    private String adminAddress;
}
