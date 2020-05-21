package com.loong.learJava.service;

import com.loong.learJava.entity.User;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
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
        user.setPassword(password);
        user.setName(name);
        System.out.println(user.getEmail());
        hibernateTemplate.save(user);
        System.out.println(user.getId());
        return user;
    }

    public boolean deleteUser(Long id) {
        User user = hibernateTemplate.get(User.class, id);
        if (user != null) {
            hibernateTemplate.delete(user);
            return true;
        }
        return false;
    }

    public void updateUser(Long id, String name) {
        User user = hibernateTemplate.get(User.class, id);
        user.setName(name);
        hibernateTemplate.update(user);
    }

    public User login(String email, String password) {
//        User example = new User();
//        example.setEmail(email);
//        example.setPassword(password);
//        List<User> list = hibernateTemplate.findByExample(example);
//        DetachedCriteria criteria = DetachedCriteria.forClass(User.class);
//        criteria.add(Restrictions.eq("email", email))
//                .add(Restrictions.eq("password", password));
//        List<User> list = (List<User>)hibernateTemplate.findByCriteria(criteria);
//        return list.isEmpty() ? null : list.get(0);

        List<User> list = (List<User>) hibernateTemplate.findByNamedQuery("login", email, password);
        return list.isEmpty() ? null : list.get(0);
    }
}
