package com.atguigu.gmall.service;

import com.alibaba.druid.util.StringUtils;
import com.atguigu.gmall.bean.UserAddress;
import java.util.List;

public class UserServiceStub implements UserService {

    private final UserService userService;

    /**
     * 传入的是userService远程的代理对象
     * @param userService
     */
    public UserServiceStub(UserService userService) {
        this.userService = userService;
    }

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        //如果被调用，这里输出一句话
        System.out.println("==========本地存根被调用=========");
        if(!StringUtils.isEmpty(userId)){
           return userService.getUserAddressList(userId);
        }
        return null;
    }
}
