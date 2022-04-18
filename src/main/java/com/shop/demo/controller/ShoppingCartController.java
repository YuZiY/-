package com.shop.demo.controller;

import java.util.List;

import javax.annotation.Resource;

import com.shop.demo.entity.ShoppingCart;
import com.shop.demo.mapper.ShoppingCartMapper;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 购物车
 */
@RestController
@RequestMapping("/shopping")

public class ShoppingCartController {
    @Resource
    private ShoppingCartMapper shoppingCartMapper;

    /**
     * 添加购物车
     * 
     * @param ShoppingCart
     * @return
     */
    @PostMapping("/addShoppingCart")
    public String addShoppingCart(@RequestBody ShoppingCart shoppingCart) {
        shoppingCartMapper.addShoppingCart(shoppingCart);
        return "success";
    }

    /**
     * 查询购物车
     * 
     * @param ShoppingCart
     * @return
     */
    @GetMapping("/findAllShoppingCart")
    public List<ShoppingCart> findShoppingCartByUserId(@RequestBody ShoppingCart shoppingCart) {
        return shoppingCartMapper.findShoppingCartByUserId(shoppingCart);
    }

    /**
     * 修改购物车数量
     * 
     * @param ShoppingCart
     * @return
     */
    @PutMapping("/updateShoppingCart")
    public String updateShoppingCart(@RequestBody ShoppingCart shoppingCart) {
        shoppingCartMapper.updateShoppingCart(shoppingCart);
        return "sucess";
    }

    /**
     * 删除购物车
     * 
     * @param ShoppingCart
     * @return
     */
    @DeleteMapping("/deleteShoppingCart/{shoppingCartId}")
    public String deleteShoppingCart(@PathVariable("shoppingCartId") int shoppingCartId) {
        shoppingCartMapper.deleteShoppingCart(shoppingCartId);
        return "success";
    }
}
