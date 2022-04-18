package com.shop.demo.controller;

import java.util.List;

import javax.annotation.Resource;

import com.shop.demo.entity.User;
import com.shop.demo.mapper.UserMapper;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    UserMapper userMapper;

    /**
     * 登录
     * 
     * @param user
     * @return
     */
    @PostMapping("/login")
    public List<User> loginUser(@RequestBody User user) {
        return userMapper.login();
    }

    /**
     * 通过用户名注册
     * 
     * @param user
     * @return
     */
    @PostMapping("/registerByName")
    public String registerByName(@RequestBody User user) {
        userMapper.registerByName(user);
        return "success";
    }

    /**
     * 通过手机号注册
     * 
     * @param user
     * @return
     */
    @PostMapping("/registerByPhone")
    public String registerByPhone(@RequestBody User user) {
        userMapper.registerByPhone(user);
        return "success";
    }

    /**
     * 重置密码
     * 
     * @param user
     * @return
     */
    @PutMapping("/reset")
    public String resetPassword(@RequestBody User user) {
        userMapper.resetPassword(user);
        return "sucess";
    }

    /**
     * 修改用户信息
     * 
     * @param user
     * @return
     */
    @PutMapping("/updateUserById")
    public String updateUserById(@RequestBody User user) {
        userMapper.updateUserById(user);
        return "sucess";
    }

    /**
     * 查询用户信息
     * 
     * @return
     */
    @GetMapping("/findAllUser")
    public List<User> findAllUser() {
        return userMapper.findAllUser();
    }

    /**
     * 删除用户
     * 
     * @param user
     * @return
     */
    @DeleteMapping("/deleteUserById/{userId}")
    public String deleteUserById(@PathVariable("userId") int userId) {
        userMapper.deleteUserById(userId);
        return "success";
    }

}
