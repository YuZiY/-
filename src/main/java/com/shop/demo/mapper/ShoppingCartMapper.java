package com.shop.demo.mapper;

import java.util.List;

import com.shop.demo.entity.ShoppingCart;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.transaction.annotation.Transactional;

public interface ShoppingCartMapper {
    /**
     * 添加购物车
     * 
     * @return
     */
    @Update("insert into shoppingcart(userId,goodsId,goodsBuynum) values(#{userId},#{goodsId},#{goodsBuynum})")
    @Transactional
    void addShoppingCart(ShoppingCart shoppingCart);

    /**
     * 查询购物车
     * 
     * @return
     */
    @Select("select * from shoppingcart where userId = #{userId}")
    List<ShoppingCart> findShoppingCartByUserId(ShoppingCart shoppingCart);

    /**
     * 修改购物车数量
     * 
     * @return
     */
    @Update("update shoppingcart set productNum = #{productNum} where userId = #{userId} and productId = #{productId}")
    @Transactional
    void updateShoppingCart(ShoppingCart shoppingCart);

    /**
     * 删除购物车
     * 
     * @return
     */
    @Delete("delete from shoppingcart where userId = #{userId} and productId = #{productId}")

    void deleteShoppingCart(int shoppingCartId);

}
