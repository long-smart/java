package com.loong.learnjava.loong.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
// 角色表
public class Role implements Serializable {
    private Integer id;
    // 名称
    private String name;
    // 角色中文名称
    private String nameZh;
}