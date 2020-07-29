package com.loong.learnjava.loong.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

// 部门表
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department implements Serializable {
    @TableId
    private Integer id;
    // 部门名字
    private String name;
    // 父部门ID
    private Integer parentId;
    // 部门 Path
    private String depPath;
    // 是否可用
    private Boolean enabled;
    // 是否是父部门
    private Boolean isParent;
    // 子部门
//    private List<Department> children = new ArrayList<>();
}