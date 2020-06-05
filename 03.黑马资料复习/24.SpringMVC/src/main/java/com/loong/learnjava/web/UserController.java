package com.loong.learnjava.web;

import com.loong.learnjava.entity.User;
import com.loong.learnjava.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
public class UserController {
    public static final String KEY_USER = "__user__";

    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    UserService userService;

    @GetMapping("/")
    public ModelAndView index(HttpSession session) {
        User user = (User) session.getAttribute(KEY_USER);
        Map<String, Object> map = new HashMap<>();
        if (user != null) {
            map.put("user", user);
        }
        return new ModelAndView("index.html", map);
    }

    @GetMapping("/register")
    public ModelAndView register() {
        return new ModelAndView("register.html");
    }

    @PostMapping("/register")
    public ModelAndView doRegister(@RequestParam("email") String email,
                                   @RequestParam("password") String password,
                                   @RequestParam("name") String name) {
        Boolean result = userService.register(email, password, name);
        if (result) {
            logger.info("user register {}", result);
            return new ModelAndView("redirect:/signin");
        }
        Map<String, String> map = new HashMap<>();
        map.put("email", email);
        map.put("error", "Register error");
        return new ModelAndView("register.html", map);
    }

    @GetMapping("/signin")
    public ModelAndView signin(HttpSession session) {
//        User user = (User) session.getAttribute(KEY_USER);
//        if (user != null) {
//            return new ModelAndView("redirect:/profile");
//        }
        return new ModelAndView("signin.html");
    }

    @PostMapping("/signin")
    public ModelAndView doSignin(@Param("email") String email, @Param("password") String password, HttpSession session) {
        try {
            User user = userService.signin(email, password);
            session.setAttribute(KEY_USER, user);
        } catch (Exception e) {
            logger.error("login faild");
            e.printStackTrace();
            Map<String, String> map = new HashMap<>();
            map.put("email", email);
            map.put("error", "login error");
            return new ModelAndView("register.html", map);
        }
        return new ModelAndView("index.html");
    }


}
