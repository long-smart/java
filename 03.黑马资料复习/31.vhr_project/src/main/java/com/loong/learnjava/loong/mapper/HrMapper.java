package com.loong.learnjava.loong.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.loong.learnjava.loong.entity.Hr;
import org.apache.ibatis.annotations.Select;

/**
 * @Author: ZhiLong Li
 * @Description: com.loong.learnjava.loong.mapper 31.vhr_project
 * @Date: create in 2020.7.29 14:07
 */
public interface HrMapper extends BaseMapper<Hr> {
    @Select("select * from hr where username = #{username};")
    Hr selectUserByUsername(String username);
}
