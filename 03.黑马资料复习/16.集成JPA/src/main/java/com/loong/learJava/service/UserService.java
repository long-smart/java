package com.loong.learJava.service;

import com.loong.learJava.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Component
@Transactional
public class UserService {
    @PersistenceContext
    EntityManager em;

    public User getUserById(long id) {
        User user = this.em.find(User.class, id);
        if (user == null) {
            throw new RuntimeException("User not found by id: " + id);
        }
        return user;
    }

    public User fetchUserByEmail(String email) {
        // CriteriaBuilder:
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<User> q = cb.createQuery(User.class);
        Root<User> r = q.from(User.class);
        q.where(cb.equal(r.get("email"), cb.parameter(String.class, "e")));
        TypedQuery<User> query = em.createQuery(q);
        // 绑定参数:
        query.setParameter("e", email);
        // 执行查询:
        List<User> list = query.getResultList();
        return list.isEmpty() ? null : list.get(0);
    }

    public User getUserByEmail(String email) {
        // JPQL查询:
        TypedQuery<User> query = em.createQuery("SELECT u FROM User u WHERE u.email = :e", User.class);
        query.setParameter("e", email);
        List<User> list = query.getResultList();
        if (list.isEmpty()) {
            throw new RuntimeException("User not found by email.");
        }
        return list.get(0);
    }

    public User login(String email, String password) {
        TypedQuery<User> query = em.createNamedQuery("login", User.class);
        query.setParameter("e", email);
        query.setParameter("p", password);
        List<User> list = query.getResultList();
        return list.isEmpty() ? null : list.get(0);
    }
}
