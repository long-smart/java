package com.loong.learnjava.loong.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
// 消息内容表
public class MsgContent {
    private Integer id;
    // 标题
    private String title;
    // 内容
    private String message;
    // 创建日期
    private Date createDate;
}