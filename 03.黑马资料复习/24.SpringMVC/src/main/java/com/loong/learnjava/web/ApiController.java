package com.loong.learnjava.web;

import com.loong.learnjava.entity.User;
import com.loong.learnjava.service.MailService;
import com.loong.learnjava.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {
    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    UserService userService;

    @Autowired
    MailService mailService;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") long id) {
        return userService.getUserById(id);
    }

    @PostMapping("/user/login")
    public User login(@RequestParam("email") String email, @RequestParam("password") String password) {
        System.out.println(10 / 0);
        return userService.signin(email, password);
    }

    @GetMapping("/user/sendMail")
    public User sendEmail() {
        User user = new User();
        user.setEmail("lizhilong@maxcn.com");
        mailService.sendRegistrationMail(user);
        return user;
    }

    @ExceptionHandler(RuntimeException.class)
    public void handleUnknowException(Exception e) {
        logger.error("ApiController异常 {} ", e.getStackTrace());
        e.printStackTrace();
    }
}
