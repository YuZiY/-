package com.shop.demo.entity;

import lombok.Data;

/**
 * 订单
 */
@Data
public class Order {
    /**
     * 单号
     * 
     * @mock 1
     */
    private int ordersId;
    /**
     * 用户id
     * 
     * @mock 1
     */
    private int userId;
    /**
     * 商品id
     * 
     * @mock 1
     */
    private int goodsId;
    /**
     * 商品名称
     * 
     * @mock 素大刀
     */
    private String goodsName;
    /**
     * 商品数量
     * 
     * @mock 1
     */
    private int goodsBuynum;

    /**
     * 商品运输情况
     * 
     * @mock 已发货
     */
    private String ordersStatus;
    /**
     * 支付方式
     * 
     * @mock 微信交易
     */
    private String PaymentMethods;
    /**
     * 商品收货地
     * 
     * @mock 广州市白云区
     */
    private String ShippingAddress;

}
