package com.ranz.service;

import com.ranz.pojo.SysUser;

import java.util.List;

public interface SysUserService {



    int addSysUser(SysUser sysUser);


    int deleteSysUser(int id);


    int updateSysUser(SysUser sysUser);


    List<SysUser> selectSysUser(int id);


    List<SysUser> queryAll();
}
