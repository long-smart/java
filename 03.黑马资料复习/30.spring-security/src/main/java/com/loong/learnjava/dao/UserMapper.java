package com.loong.learnjava.dao;

import com.loong.learnjava.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: ZhiLong Li
 * @Description: com.loong.learnjava.dao 30.spring-security
 * @Date: create in 2020.7.24 15:30
 */
@Repository
public interface UserMapper {
    @Select("select * from user")
    List<User> getUserList();

    @Select("select * from user where id=#{id}")
    User getUserById(long id);

    @Insert("insert into user (username, password) values (#{user.username}, #{user.password})")
    int createUser(User user);
}
