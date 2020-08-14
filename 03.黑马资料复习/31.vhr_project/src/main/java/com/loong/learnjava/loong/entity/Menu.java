package com.loong.learnjava.loong.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@Data
@AllArgsConstructor
// 菜单表
public class Menu implements Serializable {
    private Integer id;
    // 请求路径规则
    private String url;
    // 路由path
    private String path;
    // 组件
    private String component;
    // 组件名
    private String name;
    // 菜单图标
    private String iconCls;
    //
    private Meta meta;

    // 父菜单ID
    private Integer parentId;
    // 是否可用
    private Boolean enabled;

    @TableField(exist = false)
    private List<Menu> children;

    @TableField(exist = false)
    private List<Role> roles;
}