package com.shesuhui.girm.service;

import java.util.List;

import com.shesuhui.girm.model.Role;
import com.shesuhui.girm.model.User;


public interface LoginService {

    // public String getUserPasssword(String name, String password);

    public List<Role> getRolesByUserName(String userName);

    public String getPermissionByRid(String rid);

    public User getUserByLoginName(String loginName);

    public User getUser(String loginName, String password);

}
