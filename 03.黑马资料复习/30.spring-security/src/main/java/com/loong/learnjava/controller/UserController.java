package com.loong.learnjava.controller;

import com.loong.learnjava.dao.UserMapper;
import com.loong.learnjava.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: ZhiLong Li
 * @Description: com.loong.learnjava.controller 30.spring-security
 * @Date: create in 2020.7.24 15:34
 */
@Controller
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserMapper userMapper;

    @GetMapping("/getUserList")
    public List<User> getUser() {
        return userMapper.getUserList();
    }

    @PostMapping("/createUser")
    public String createUser(User user) {
        int row = userMapper.createUser(user);
        if (row == 1) {
            return "success";
        } else {
            return "error";
        }
    }
}
