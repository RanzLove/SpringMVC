package com.ranz.controller;

import com.alibaba.fastjson.JSONObject;
import com.ranz.pojo.SysUser;
import com.ranz.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

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
    public String addSysUser(@RequestParam("file") CommonsMultipartFile file, SysUser sysUser, HttpServletRequest request){



        int i = sysUserService.addSysUser(sysUser);
        String filePath = "/Users/JFlying/tool/static/wukong/"+ file.getOriginalFilename();
        try {
            file.transferTo(new File(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
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
