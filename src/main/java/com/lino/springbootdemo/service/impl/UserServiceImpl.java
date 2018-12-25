package com.lino.springbootdemo.service.impl;

import com.lino.springbootdemo.dao.UserMapper;
import com.lino.springbootdemo.pojo.User;
import com.lino.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LINO
 * @Title: UserServiceImpl
 * @ProjectName springboot-demo
 * @Description: TODO
 * @date 2018/12/25
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Cacheable(value = "allUser")
    public List<User> list() {
        System.out.println("测试缓存。。。。。。。。。。。。。。");
        return userMapper.select();
    }
}
