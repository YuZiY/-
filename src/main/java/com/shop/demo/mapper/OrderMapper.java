package com.shop.demo.mapper;

import java.util.List;

import com.shop.demo.entity.Order;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.transaction.annotation.Transactional;

public interface OrderMapper {
    /**
     * 从购物车中添加订单
     * 
     * @return
     */
    @Update("insert into `order`(userId,goodsId,goodsBuynum) values(#{userId},#{goodsId},#{goodsBuynum})")
    @Transactional
    void addOrder(Order order);

    /**
     * 查询订单
     * 
     * @return
     */
    @Select("select * from `order`")
    List<Order> findAllOrder();

    /**
     * 支付方式
     * 
     * @return
     */
    @Update("update `order` set PaymentMethods = #{PaymentMethods} where ordersId = #{ordersId}")
    @Transactional
    void updateOrder(Order order);

    /**
     * 删除订单
     * 
     * @return
     */
    @Update("delete from `order` where ordersId = #{ordersId}")
    @Transactional
    void deleteOrder(int orderId);

    /**
     * 修改订单状态
     * 
     * return
     */
    @Update("update `order` set ordersStatus = #{ordersStatus} where ordersId = #{ordersId}")
    @Transactional
    void updateOrderStatus(Order order);

}
