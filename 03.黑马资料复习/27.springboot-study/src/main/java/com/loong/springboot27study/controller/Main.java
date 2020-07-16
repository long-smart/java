package com.loong.springboot27study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: ZhiLong Li
 * @Description: com.loong.springboot27study.controller 27.springboot-study
 * @Date: create in 2020.7.9 17:12
 */
@Controller
@RestController
public class Main {
    @GetMapping("/")
    @ResponseBody
    public String index() {
        return "index page123";
    }
}
