package com.ranz.controller;

import com.alibaba.fastjson.JSONObject;
import com.ranz.pojo.SysUser;
import com.ranz.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @program: springMVC
 * @description:
 * @author: J.Flying
 * @create: 2020-09-16 17:29
 */
@Controller
@RequestMapping("/sysUser")
public class SysUserController {


    @Autowired
    @Qualifier("sysUserServiceImpl")
    private SysUserService sysUserService;

    @RequestMapping("/queryAll")
    public String queryAll(Model model){
        List<SysUser> sysUsers = sysUserService.queryAll();
//        sysUsers.get(0).ge
        model.addAttribute("list",sysUsers);
        String s = JSONObject.toJSONString(sysUsers);
        System.out.println(s);
        return "sysUser";
    }


    @RequestMapping("/showAddModal")
    public String showAddModal(){
        System.out.println("跳转页面。。。。。。。。");
        return "addSys";
    }

    @RequestMapping("/addSysUser")
    public String addSysUser(SysUser sysUser){
        int i = sysUserService.addSysUser(sysUser);
        System.out.println("添加成功。。。。。。。。");
        return "redirect:/sysUser/queryAll";
    }


    @RequestMapping("/deleteSysUser")
    public String deleteSysUser(int id){
        int i = sysUserService.deleteSysUser(id);
        System.out.println("删除。。。。。。。。");
        return "redirect:/sysUser/queryAll";
    }


}
