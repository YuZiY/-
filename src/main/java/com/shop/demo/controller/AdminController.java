package com.shop.demo.controller;

import java.util.List;

import javax.annotation.Resource;

import com.shop.demo.entity.Admin;
import com.shop.demo.mapper.AdminMapper;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 管理员
 */
@RestController
@RequestMapping("/admin")
public class AdminController {

    @Resource
    AdminMapper adminMapper;

    /**
     * 通过用户名登录
     * 
     * @param admin
     * @return
     */
    @PostMapping("/login")
    public List<Admin> loginAdmin(@RequestBody Admin admin) {
        return adminMapper.loginByName(admin);
    }

    /**
     * 通过手机号登录
     * 
     * @param admin
     * @return
     */
    @PostMapping("/loginByPhone")
    public List<Admin> loginAdminByPhone(@RequestBody Admin admin) {
        return adminMapper.loginByPhone(admin);
    }

    /**
     * 通过用户名注册
     * 
     * @param admin
     * @return
     */
    @PostMapping("/registerByName")
    public String registerByName(@RequestBody Admin admin) {
        adminMapper.registerByName(admin);
        return "success";
    }

    /**
     * 通过手机号注册
     * 
     * @param admin
     * @return
     */
    @PostMapping("/registerByPhone")
    public String registerByPhone(@RequestBody Admin admin) {
        adminMapper.registerByPhone(admin);
        return "sucess";
    }

    /**
     * 重置密码
     * 
     * @param admin
     * @return
     */
    @PostMapping("/reset")
    public String resetPassword(@RequestBody Admin admin) {
        adminMapper.resetPassword(admin);
        return "sucess";
    }

    /**
     * 修改管理员用户
     * 
     * @param admin
     * @return
     */
    @PutMapping("/update")
    public String updateAdmin(@RequestBody Admin admin) {
        adminMapper.updateAdminById(admin);
        return "success";
    }

    /**
     * 删除管理员用户
     * 
     * @param admin
     * @return
     */
    @DeleteMapping("/delete/{admiId}")
    public String deleteAdmin(@PathVariable("admiId") int admiId) {
        adminMapper.deleteAdminById(admiId);
        return "success";
    }

    /**
     * 查找管理员用户id
     * 
     * @param admin
     * @return
     */
    @GetMapping("/find")
    public List<Admin> findAdmin(@RequestBody Admin admin) {
        return adminMapper.findAdminByNameOrPhone(admin);
    }
}