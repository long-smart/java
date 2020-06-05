package com.loong.learnjava.service;

import com.loong.learnjava.entity.User;
import com.loong.learnjava.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component
public class UserService {

    final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    UserMapper userMapper;

    public User getUserById(long id) {
        return userMapper.getUserById(id);
    }

    public boolean register(String email, String password, String name) {
        try {
            logger.info("注册 by {}", email);
            User user = new User();
            user.setEmail(email);
            user.setPassword(password);
            user.setName(name);

            return userMapper.insertUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public User signin(String email, String password) {
        logger.info("login by email {} password {}", email, password);
        User user = userMapper.getUserByEmail(email);
        if (user != null) {
            if (user.getPassword().equals(password)) {
                return user;
            }
        }
        throw new RuntimeException("login failed");
    }
}
