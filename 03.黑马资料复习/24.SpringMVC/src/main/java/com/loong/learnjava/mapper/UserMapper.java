package com.loong.learnjava.mapper;

import com.loong.learnjava.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    @Select("select * from users where id = #{id}")
    User getUserById(@Param("id") long id);

    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    @Insert("insert into users(email, password, name, createdAt) values(#{user.email}, #{user.password}, #{user.name}, #{user.createdAt} )")
    boolean insertUser(@Param("user") User user);

    @Select("select * from users where email = #{email} ;")
    User getUserByEmail(@Param("email") String email);
}
