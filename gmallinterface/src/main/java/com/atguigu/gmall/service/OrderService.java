package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.UserAddress;

import java.util.List;

public interface OrderService {
    /**
     * 根据用户id初始化订单
     */
     List<UserAddress> initOrder(String userId);
}
