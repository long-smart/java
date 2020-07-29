package com.loong.learnjava.loong.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
// 民族表
public class Nation implements Serializable {
    private Integer id;
    // 名称
    private String name;
}