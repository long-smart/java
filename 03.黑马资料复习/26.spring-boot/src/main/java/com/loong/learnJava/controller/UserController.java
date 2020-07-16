package com.loong.learnJava.controller;

import com.loong.learnJava.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletRequest;

/**
 * @Author: ZhiLong Li
 * @Description: com.loong.learnJava.controller 26.spring-boot
 * @Date: create in 2020.6.11 10:54
 */
@Controller
@RequestMapping("/api/user")
public class UserController {
    @GetMapping("/getUser")
    @ResponseBody
    public User getUser() {
        User user = new User();
        user.setName("lizhilong");
        user.setEmail("123123@qq.com");


        return user;
    }
}
