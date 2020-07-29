package com.loong.learnjava.loong.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

// 员工评价表
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Appraise {
    private Integer id;
    // 员工ID
    private Integer eid;
    // 考评日期
    private Date appDate;
    // 考评结果
    private String appResult;
    // 考评内容
    private String appContent;
    // 备注
    private String remark;
}