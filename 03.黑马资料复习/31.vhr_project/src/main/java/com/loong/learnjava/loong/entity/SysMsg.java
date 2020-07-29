package com.loong.learnjava.loong.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 系统消息
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysMsg {
    private Integer id;
    // 消息ID
    private Integer mid;
    // 0 表示群发
    private Integer type;
    // 这条消息给谁
    private Integer hrid;
    // 状态 (0 : 未读, 1: 已读)
    private Integer state;
}