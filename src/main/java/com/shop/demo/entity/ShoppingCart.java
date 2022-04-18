package com.shop.demo.entity;

import lombok.Data;

/**
 * 购物车
 */
@Data
public class ShoppingCart {
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
    private String goodsId;
    /**
     * 商品数量
     * 
     * @mock 1
     */
    private String goodsBuynum;

}
