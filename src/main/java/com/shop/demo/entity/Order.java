package com.shop.demo.entity;

import lombok.Data;

@Data
public class Order {
    /**
     * 单号
     */
    private int ordersId;
    /**
     * 用户id
     */
    private int userId;
    /**
     * 商品id
     */
    private int goodsId;
    /**
     * 商品名称
     */
    private String goodsName;
    /**
     * 商品编号
     */
    private int goodsBuynum;
    /**
     * 总价
     */
    private double ordersPrice;
    /**
     * 商品运输情况
     */
    private String ordersStatus;
    /**
     * 交易类型
     */
    private String PaymentMethods;
    /**
     * 商品收货地
     */
    private String ShippingAddress;

}
