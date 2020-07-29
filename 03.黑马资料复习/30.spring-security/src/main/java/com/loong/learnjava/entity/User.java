package com.loong.learnjava.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @Author: ZhiLong Li
 * @Description: com.loong.learnjava.entity 30.spring-security
 * @Date: create in 2020.7.24 15:28
 */
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private long id;
    private String username;
    private String password;
}
