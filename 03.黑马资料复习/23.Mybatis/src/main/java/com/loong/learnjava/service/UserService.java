package com.loong.learnjava.service;

import com.loong.learnjava.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    @Autowired
    UserMapper userMapper;

    public User getUserById(long id) {
        User user = userMapper.getUserById(id);
        if (user == null) {
            throw new RuntimeException("user not found");
        }
        return user;
    }

    public void insertUser(User user) {
        int a = userMapper.insertUser(user);
        System.out.println(a);
    }
}
