package com.loong.learnjava.loong.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
// 员工调岗表
public class Employeeremove {
    private Integer id;
    // 员工ID
    private Integer eid;
    // 调动后部门ID
    private Integer afterDepId;
    // 调动后职位
    private Integer afterJobId;
    // 调动日期
    private Date removeDate;
    // 调动原因
    private String reason;
    // 备注
    private String remark;
}