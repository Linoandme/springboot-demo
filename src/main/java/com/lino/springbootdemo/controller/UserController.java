package com.lino.springbootdemo.controller;

import com.lino.springbootdemo.pojo.User;
import com.lino.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author LINO
 * @Title: UserController
 * @ProjectName springboot-demo
 * @Description: TODO
 * @date 2018/12/25
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;
   @RequestMapping("list")
    public List<User> list(){

       return userService.list();
   }
}
