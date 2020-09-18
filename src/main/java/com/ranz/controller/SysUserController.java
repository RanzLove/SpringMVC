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


}
