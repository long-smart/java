package com.loong.learnjava.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @Author: ZhiLong Li
 * @Description: com.loong.learnjava.entity 28.springboo-02
 * @Date: create in 2020.7.20 16:33
 */
@Data
@Component
public class User {
    @TableId(value = "id",type = IdType.INPUT)
    private Long id;
    private String name;
    private int age;
    private char sex;
    private String email;
    private String password;

    public User(Long id, String name, int age, char sex, String email, String password) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.email = email;
        this.password = password;
    }

    public User() {}
}
