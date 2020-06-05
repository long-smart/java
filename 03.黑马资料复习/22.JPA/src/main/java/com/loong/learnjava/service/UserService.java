package com.loong.learnjava.service;

import com.loong.learnjava.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
@Transactional
public class UserService {
    @PersistenceContext
    EntityManager em;

    public User getUserById(long id) {
        User user = em.find(User.class, id);
        if (user == null) {
            throw new RuntimeException("User not found by id: " + id);
        }
        return user;
    }
}
