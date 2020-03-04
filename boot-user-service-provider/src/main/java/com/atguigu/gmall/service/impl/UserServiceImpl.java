package com.atguigu.gmall.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.UserService;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

//@Service
@Component
public class UserServiceImpl implements UserService {
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress address1 = new UserAddress(1,"西溪首座","1","李师师","18867182837","Y");
        UserAddress address2 = new UserAddress(2,"栖息谷","1","西施","18768112871","Y");
        return Arrays.asList(address1,address2);
    }
}
