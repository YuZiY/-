package com.shop.demo.entity;

import lombok.Data;

/**
 * 商品
 */
@Data
public class Goods {
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
     * 商品类型
     * 
     * @mock 食物
     */
    private String goodsType;
    /**
     * 商品库存
     * 
     * @mock 100
     */
    private String goodsInventory;
    /**
     * 商品描述
     * 
     * @mock 【卫龙大刀辣条】素大刀肉袋装麻辣儿时经典解馋零食小吃休闲食品
     */
    private String goodsDescription;
    /**
     * 商品价格
     * 
     * @mock 13.90
     */
    private double goodsPrice;
}
