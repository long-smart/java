package com.loong.learnjava.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @Author: ZhiLong Li
 * @Description: com.loong.learnjava.filter 24.SpringMVC
 * @Date: create in 2020.6.5 11:25
 */
@WebFilter("/")
public class DemoFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("没有让spring代理的filter也能执行啊");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
