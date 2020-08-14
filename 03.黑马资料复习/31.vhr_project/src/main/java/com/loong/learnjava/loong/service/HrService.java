package com.loong.learnjava.loong.service;

import com.loong.learnjava.loong.entity.Hr;
import com.loong.learnjava.loong.mapper.HrMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: ZhiLong Li
 * @Description: com.loong.learnjava.loong.service 31.vhr_project
 * @Date: create in 2020.7.29 14:07
 */
@Service
public class HrService implements UserDetailsService {
    @Autowired
    HrMapper hrMapper;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Hr hr = hrMapper.selectUserByUsername(s);
        if (hr == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }
        return hr;
    }

    public List<Hr> getUserList() {
        return hrMapper.selectList(null);
    }
}
