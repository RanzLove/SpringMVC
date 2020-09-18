package com.ranz.dao;

import com.ranz.pojo.SysUser;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface SysUserMapper {

    int addSysUser(SysUser sysUser);


    int deleteSysUser(int id);


    int updateSysUser(SysUser sysUser);


    List<SysUser> selectSysUser(int id);


    List<SysUser> queryAll();


}
