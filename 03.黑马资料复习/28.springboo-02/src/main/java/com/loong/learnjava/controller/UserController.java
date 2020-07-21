package com.loong.learnjava.controller;

import com.loong.learnjava.entity.User;
import com.loong.learnjava.mapper.UserMapper;
import io.swagger.v3.oas.annotations.Operation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: ZhiLong Li
 * @Description: com.loong.learnjava.controller 28.springboo-02
 * @Date: create in 2020.7.20 16:26
 */
@Controller
@RestController
@RequestMapping("/user")
public class UserController {
    Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserMapper userMapper;

    @Operation(summary = "获取全部用户")
    @GetMapping("/getUserList")
    public List<User> getUserList() {
        return userMapper.selectList(null);
    }

    @PostMapping("/createUser")
    @Operation(summary = "创建用户")
    public String createUser(User user) {
        System.out.println(user);

        int row = userMapper.insert(user);
        if (row == 1) {
            return "success";
        } else {
            return "failed";
        }
    }
}
