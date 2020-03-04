package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.UserAddress;

import java.util.List;

/**
 * 用户服务接口
 */

public interface UserService {

  List<UserAddress> getUserAddressList(String userId);

}

