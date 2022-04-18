package com.shop.demo.entity;

import lombok.Data;

/**
 * 管理员
 */
@Data
public class Admin {
    /**
     * 管理员id
     * 
     * @mock 1
     */
    private int adminId;
    /**
     * 管理员昵称
     * 
     * @mock laoxue
     */
    private String adminName;
    /**
     * 管理员密码
     * 
     * @mock 123456
     */
    private String adminPassword;
    /**
     * 管理员手机
     * 
     * @mock 13215116663
     */
    private String adminPhone;
    /**
     * 管理员地址
     * 
     * @mock 广州理工学院
     */
    private String adminAddress;
}
