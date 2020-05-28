package com.loong.learnjava.IOC;

import com.loong.learnjava.IOC.service.User;
import com.loong.learnjava.IOC.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        // 从classpath中查找指定xml文件
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        UserService userService = context.getBean(UserService.class);
        User user = userService.login("362808513@qq.com", "123456");
        System.out.println(user);
    }
}
