package com.ranz.service;

import com.ranz.dao.SysUserMapper;
import com.ranz.pojo.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: springMVC
 * @description:
 * @author: J.Flying
 * @create: 2020-09-16 11:42
 */
@Service
public class SysUserServiceImpl implements SysUserService {


    private SysUserMapper sysUserMapper;


    public void setSysUserMapper(SysUserMapper sysUserMapper) {
        this.sysUserMapper = sysUserMapper;
    }

    @Override
    public int addSysUser(SysUser sysUser) {

        return sysUserMapper.addSysUser(sysUser);
    }

    @Override
    public int deleteSysUser(int id) {
        return sysUserMapper.deleteSysUser(id);
    }

    @Override
    public int updateSysUser(SysUser sysUser) {
        return sysUserMapper.updateSysUser(sysUser);
    }

    @Override
    public List<SysUser> selectSysUser(int id) {
        return sysUserMapper.selectSysUser(id);
    }

    @Override
    public List<SysUser> queryAll() {
        return sysUserMapper.queryAll();
    }
}
