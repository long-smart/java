package com.loong.learnjava.loong.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
// 职位表
public class Position implements Serializable {
    private Integer id;
    // 名称
    private String name;
    // 创建日期
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Shanghai")
    private Date createDate;
    // 是否启用
    private Boolean enabled;
}