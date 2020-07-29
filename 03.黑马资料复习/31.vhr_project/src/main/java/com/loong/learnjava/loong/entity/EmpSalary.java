package com.loong.learnjava.loong.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
// 员工薪资关联表
public class EmpSalary {
    private Integer id;
    // 员工ID
    private Integer eid;
    // 薪资ID
    private Integer sid;
}