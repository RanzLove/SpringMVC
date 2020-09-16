package com.ranz.dao;

import com.ranz.pojo.SysUser;

import java.util.List;

public interface SysUserMapper {

    int addSysUser(SysUser sysUser);


    int deleteSysUser(int id);


    int updateSysUser(SysUser sysUser);


    List<SysUser> selectSysUser(int id);


    List<SysUser> queryAll();


}
