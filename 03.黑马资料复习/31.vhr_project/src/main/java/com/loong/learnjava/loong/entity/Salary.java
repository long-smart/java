package com.loong.learnjava.loong.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Salary {
    private Integer id;
    // 基本工资
    private Integer basicSalary;
    // 奖金
    private Integer bonus;
    // 午餐补助
    private Integer lunchSalary;
    // 交通补助
    private Integer trafficSalary;
    // 应发工资
    private Integer allSalary;
    // 养老金基数
    private Integer pensionBase;
    // 养老金比例
    private Float pensionPer;
    // 启用时间
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createDate;
    // 医疗基数
    private Integer medicalBase;
    // 医疗保险比例
    private Float medicalPer;
    // 公积金基数
    private Integer accumulationFundBase;
    // 公积金比例
    private Float accumulationFundPer;
    // 账套名称
    private String name;
}