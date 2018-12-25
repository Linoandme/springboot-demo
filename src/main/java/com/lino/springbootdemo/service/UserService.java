package com.lino.springbootdemo.service;

import com.lino.springbootdemo.pojo.User;

import java.util.List;

/**
 * @author LINO
 * @Title: UserService
 * @ProjectName springboot-demo
 * @Description: TODO
 * @date 2018/12/25
 */
public interface UserService {
    List<User> list();
}
