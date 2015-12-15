package com.shesuhui.girm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shesuhui.girm.dao.PermitMapper;
import com.shesuhui.girm.dao.RoleMapper;
import com.shesuhui.girm.dao.UserMapper;
import com.shesuhui.girm.model.Permit;
import com.shesuhui.girm.model.Role;
import com.shesuhui.girm.model.User;
import com.shesuhui.girm.service.LoginService;
import com.shesuhui.girm.util.MD5Util;


@Service
public class LoginServiceImpl implements LoginService {

    @Resource
    private UserMapper userDao;

    @Resource
    private RoleMapper roleMapper;

    @Resource
    private PermitMapper permitMapper;

    @Override
    public List<Role> getRolesByUserName(String userName) {
        return this.roleMapper.getRolesByUserName(userName);
    }

    @Override
    public String getPermissionByRid(String rid) {
        StringBuilder sb = new StringBuilder();
        List<Permit> permits = this.permitMapper.getPermitByRid(rid);
        for (Permit p : permits) {
            sb.append(p.getPermitName()).append(",");
        }
        String peritName = sb.toString();
        peritName = peritName.substring(0, peritName.lastIndexOf(","));
        return peritName;
    }

    @Override
    public User getUserByLoginName(String loginName) {
        return this.userDao.getUserByLoginName(loginName);
    }

    @Override
    public User getUser(String loginName, String password) {
        return this.userDao.getUserByPassword(loginName, MD5Util.MD5(password));
    }
}
