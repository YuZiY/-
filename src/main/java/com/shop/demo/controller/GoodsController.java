package com.shop.demo.controller;

import java.util.List;

import javax.annotation.Resource;

import com.shop.demo.entity.Goods;
import com.shop.demo.mapper.GoodsMapper;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 商品
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {
    @Resource
    GoodsMapper goodsMapper;

    /**
     * 通过名字查找
     * 
     * 
     * @param admin
     * @return
     */
    @GetMapping("/findGoodsByName")
    public List<Goods> findGoodsByName(String goodsName) {
        return goodsMapper.findGoodsByName(goodsName);
    }

    /**
     * 通过类型查找
     * 
     * 
     * @param admin
     * @return
     */
    @GetMapping("/findGoodsByType")
    public List<Goods> findGoodsByType(String goodsType) {
        return goodsMapper.findGoodsByType(goodsType);
    }

    /**
     * 通过价格范围
     * 
     * 
     * @param admin
     * @return
     */
    @GetMapping("/findGoodsByPrice")
    public List<Goods> findGoodsByPrice(double goodsPrice1,
            double goodsPrice2) {
        return goodsMapper.findGoodsByPrice(goodsPrice1, goodsPrice2);
    }

    /**
     * 添加
     * 
     * 
     * @param admin
     * @return
     */
    @PostMapping("/addGoods")
    public String addGoods(@RequestBody Goods goods) {
        goodsMapper.addGoods(goods);
        return "sucess";
    }

    /**
     * 删除
     * 
     * 
     * @param admin
     * @return
     */
    @DeleteMapping("/deleteGoods/{goodId}")
    public String deleteGoods(@PathVariable("goodId") int goodId) {
        goodsMapper.deleteGoodsById(goodId);
        return "success";
    }

}
