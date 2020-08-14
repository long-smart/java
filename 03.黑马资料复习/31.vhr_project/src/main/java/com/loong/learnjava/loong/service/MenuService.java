package com.loong.learnjava.loong.service;

import com.loong.learnjava.loong.entity.Menu;
import com.loong.learnjava.loong.mapper.MenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: ZhiLong Li
 * @Description: com.loong.learnjava.loong.service 31.vhr_project
 * @Date: create in 2020.7.29 14:44
 */
@Service
public class MenuService {
    @Autowired
    MenuMapper menuMapper;

    public List<Menu> getAllMenus() {
        return menuMapper.selectList(null);
    }
}
