package com.loong.learnjava.loong.controller;

import com.loong.learnjava.loong.entity.Department;
import com.loong.learnjava.loong.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: ZhiLong Li
 * @Description: com.loong.learnjava.loong.controller 31.vhr_project
 * @Date: create in 2020.7.29 9:13
 */
@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    DepartmentMapper departmentMapper;

    @GetMapping("getList")
    List<Department> getDepartment() {
        return departmentMapper.selectList(null);
    }
}
