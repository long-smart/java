package com.loong.learnjava.loong.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

// 员工表
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Serializable {
    private Integer id;
    // 名字
    private String name;
    // 性别
    private String gender;
    // 出生日期
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Shanghai")
    private Date birthday;
    // 身份证号
    private String idCard;
    // 婚姻状况
    private String wedlock;
    // 名族ID
    private Integer nationId;
    // 籍贯
    private String nativePlace;
    // 政治面貌ID
    private Integer politicId;
    // 邮件
    private String email;
    // 电话号码
    private String phone;
    // 地址
    private String address;
    // 所属部门ID
    private Integer departmentId;
    // 职称id
    private Integer jobLevelId;
    // 职位ID
    private Integer posId;
    // 聘用形式
    private String engageForm;
    // 最高学历
    private String tiptopDegree;
    // 所处专业
    private String specialty;
    // 毕业院校
    private String school;
    // 入职日期
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Shanghai")
    private Date beginDate;
    // 在职状态
    private String workState;
    // 工号
    private String workID;
    // 合同期限
    private Double contractTerm;
    // 转正日期
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Shanghai")
    private Date conversionTime;
    // 离职日期
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Shanghai")
    private Date notWorkDate;
    // 合同起始日期
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Shanghai")
    private Date beginContract;
    // 合同结束日期
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Shanghai")
    private Date endContract;
    // 工龄
    private Integer workAge;

    private Nation nation;
    private Politicsstatus politicsstatus;
    private Department department;
    private JobLevel jobLevel;
    private Position position;
    private Salary salary;
}