package com.atguigu.gmall.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.OrderService;
import com.atguigu.gmall.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService  {

    @Reference
    private UserService userService;
    public List<UserAddress> initOrder(String userId) {
        //查询用户的收货地址
        List<UserAddress> addresslist = userService.getUserAddressList(userId);
        System.out.println(addresslist);
        return addresslist;
    }
}
