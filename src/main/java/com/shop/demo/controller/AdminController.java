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
     * 登录
     * 
     * @param admin
     * @return
     */
    @PostMapping("/login")
    public List<Admin> loginAdmin(@RequestBody Admin admin) {
        return adminMapper.login();
    }

    /**
     * 注册
     * 
     * @param admin
     * @return
     */
    @PostMapping("/register")
    public List<Admin> registerAdmin(@RequestBody Admin admin) {
        return adminMapper.register();
    }

    /**
     * 重置密码
     * 
     * @param admin
     * @return
     */
    @PostMapping("/reset")
    public String resetPassword(@RequestBody Admin admin) {
        return "sucess";
    }

    /**
     * 添加管理员用户
     * 
     * @param admin
     * @return
     */
    @PostMapping("/add")
    public String addAdimn(@RequestBody Admin admin) {
        adminMapper.save(admin);
        return "success";
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
     * 通过id查找管理员用户
     * 
     * @param admin
     * @return
     */
    @GetMapping("/find/{admiId}")
    public List<Admin> findAdmin(@PathVariable("admiId") int admiId) {
        return adminMapper.findAdminById(admiId);
    }
}