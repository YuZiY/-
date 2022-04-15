package com.shop.demo.entity;

import lombok.Data;

@Data
public class Goods {
    /**
     * 商品id
     */
    private int goodsId;
    /**
     * 商品名称
     */
    private String goodsName;
    /**
     * 商品类型
     */
    private String goodsType;
    /**
     * 商品库存
     */
    private String goodsInventory;
    /**
     * 商品描述
     */
    private String goodsDescription;
    /**
     * 商品价格
     */
    private double goodsPrice;
}
