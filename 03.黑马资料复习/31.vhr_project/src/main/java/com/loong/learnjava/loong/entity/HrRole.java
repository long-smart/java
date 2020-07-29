package com.loong.learnjava.loong.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
// HR角色表
public class HrRole {
    private Integer id;
    // 操作员ID hr
    private Integer hrid;
    // 角色ID
    private Integer rid;
}