package com.shop.demo.controller;

import java.util.List;

import javax.annotation.Resource;

import com.shop.demo.entity.Order;
import com.shop.demo.mapper.OrderMapper;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 订单
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Resource
    private OrderMapper orderMapper;

    /**
     * 从购物车中添加订单
     * 
     * @param order
     * @return
     */
    @PostMapping("/addOrder")
    public String addOrder(@RequestBody Order order) {
        orderMapper.addOrder(order);
        return "success";
    }

    /**
     * 查询订单
     * 
     * @param order
     * @return
     */
    @GetMapping("/findAllOrder")
    public List<Order> findAllOrder() {
        return orderMapper.findAllOrder();
    }

    /**
     * 支付方式
     * 
     * @param order
     * @return
     */
    @PutMapping("/updateOrder")
    public String updateOrder(@RequestBody Order order) {
        orderMapper.updateOrder(order);
        return "success";
    }

    /**
     * 删除订单
     * 
     * @param order
     * @return
     */
    @DeleteMapping("/deleteOrder/{orderId}")
    public String deleteOrder(@PathVariable("orderId") int orderId) {
        orderMapper.deleteOrder(orderId);
        return "success";
    }

    /**
     * 修改订单状态
     * 
     * @param order
     * @return
     */
    @PutMapping("/updateOrderStatus")
    public String updateOrderStatus(@RequestBody Order order) {
        orderMapper.updateOrderStatus(order);
        return "success";
    }
}
