package com.loong.learnjava.mapper;

import com.loong.learnjava.service.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    @Select("select * from users where id = #{id} ")
    User getUserById(@Param("id") long id);

    @Insert("insert into users (email, password, name, createdAt) values (#{user.email}, #{user.password}, #{user.name}, #{user.createdAt}  );")
    int insertUser(@Param("user") User user);
}
