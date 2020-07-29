package com.loong.learnjava.loong.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
// 员工培训表
public class Employeetrain {
    private Integer id;
    // 员工ID
    private Integer eid;
    // 培训日期
    private Date trainDate;
    // 培训内容
    private String traincontent;
    // 备注
    private String remark;
}