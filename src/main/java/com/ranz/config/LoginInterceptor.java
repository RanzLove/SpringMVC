package com.ranz.config;

/**
 * @program: springMVC
 * @description:
 * @author: J.Flying
 * @create: 2020-09-18 15:56
 */

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
* @Description: 登录拦截器
* @Author: J.Flying 
* @Date: 2020/9/18 
*/ 
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println(">>>>>>>>拦截前>>>>>>>>>>>>");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println(">>>>>>>>拦截后>>>>>>>>>>>>");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println(">>>>>>>>清零数据>>>>>>>>>>>>");
    }
}
