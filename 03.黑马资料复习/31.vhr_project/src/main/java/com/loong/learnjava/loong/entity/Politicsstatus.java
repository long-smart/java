package com.loong.learnjava.loong.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

// 政治面貌表
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Politicsstatus implements Serializable {
    private Integer id;
    // 名字
    private String name;
}