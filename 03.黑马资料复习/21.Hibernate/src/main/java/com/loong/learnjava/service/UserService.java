package com.loong.learnjava.service;

import com.loong.learnjava.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Transactional
public class UserService {
    @Autowired
    HibernateTemplate hibernateTemplate;

    public User register(String email, String password, String name) {
        User user = new User();
        user.setEmail(email);
        user.setPassword(email);
        user.setName(name);
        hibernateTemplate.save(user);
        return user;
    }

    public boolean deleteUser(Long id) {
        User user = hibernateTemplate.get(User.class, id);
        if (user != null) {
            hibernateTemplate.delete(user);
            return true;
        } else {
            return false;
        }
    }

    public void updateUser(Long id, String name) {
        User user = hibernateTemplate.get(User.class, id);
        user.setName(name);
        hibernateTemplate.update(user);
    }

    // 查询
    public User getUserById(long id) {
        User user = new User();
        user.setId(id);
        List<User> users = hibernateTemplate.findByExample(user);
        System.out.println(users.size());
        return users.isEmpty() ? null : users.get(0);
    }
}
