package com.loong.learnjava.loong.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
// 菜单角色表
public class MenuRole {
    private Integer id;
    // 菜单ID
    private Integer mid;
    // 角色Id
    private Integer rid;

    public Integer getId() {
        return id;
    }
}