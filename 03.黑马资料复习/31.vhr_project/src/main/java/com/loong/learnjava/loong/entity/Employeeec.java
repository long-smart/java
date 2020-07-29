package com.loong.learnjava.loong.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
// 员工奖惩表
public class Employeeec {
    private Integer id;
    // 员工ID
    private Integer eid;
    // 奖惩日期
    private Date ecDate;
    // 奖惩原因
    private String ecReason;
    // 奖惩分
    private Integer ecPoint;
    // 奖惩类别 0: 奖    1： 罚
    private Integer ectype;
    // 备注
    private String remark;
}