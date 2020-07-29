package com.loong.learnjava.loong.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
// 操作日志表
public class OpLog {
    private Integer id;
    // 添加日期
    private Date addDate;
    // 操作内容
    private String operate;
    // 操作员Id
    private Integer hrid;
}