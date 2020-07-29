package com.loong.learnjava.loong.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
// 职称表
public class JobLevel implements Serializable {
    private Integer id;
    // 名字
    private String name;
    // 职称级别
    private String titleLevel;
    // 创建日期
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Shanghai")
    private Date createDate;
    // 是否可用
    private Boolean enabled;
}