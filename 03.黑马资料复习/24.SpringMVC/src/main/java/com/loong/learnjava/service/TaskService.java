package com.loong.learnjava.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @Author: ZhiLong Li
 * @Description: com.loong.learnjava.service 24.SpringMVC
 * @Date: create in 2020.6.5 16:12
 */
@Component
public class TaskService {
    @Scheduled(initialDelay = 10 * 1000, fixedDelay = 3 * 1000)
    public void task1() {
        System.out.println("task执行...");
    }

    @Scheduled(cron = "*/3 0 0 0 0 0 0 ")
    public void task2() {
        System.out.println("你好执行了......");
    }

}
