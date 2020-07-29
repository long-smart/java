package com.loong.learnjava.loong.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

// 员工调薪表
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdjustSalary {
    private Integer id;
    // 员工ID
    private Integer eid;
    // 调薪日期
    private Date asDate;
    // 调前薪资
    private Integer beforeSalary;
    // 调后薪资
    private Integer afterSalary;
    // 调薪原因
    private String reason;
    // 备注
    private String remark;
}