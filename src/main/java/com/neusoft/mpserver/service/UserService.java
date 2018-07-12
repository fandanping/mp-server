package com.neusoft.mpserver.service;

import java.util.Map;

/**
 * 用户模块service层接口
 */
public interface UserService {
   //用户注册
    public String addUser(String username,String password);
    //用户登录
    public Map<String ,Object> login (String username,String password);

}
