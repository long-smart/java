package com.loong.learnjava.loong.controller;

import com.loong.learnjava.loong.entity.Hr;
import com.loong.learnjava.loong.service.HrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: ZhiLong Li
 * @Description: com.loong.learnjava.loong.controller 31.vhr_project
 * @Date: create in 2020.7.29 14:12
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    HrService hrService;
    @GetMapping("/getUserList")
    public List<Hr> getUserList() {
        return hrService.getUserList();
    }
}
