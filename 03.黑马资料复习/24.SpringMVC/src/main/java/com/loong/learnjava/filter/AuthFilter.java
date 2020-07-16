package com.loong.learnjava.filter;

import com.loong.learnjava.web.UserController;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: lzl36
 * @Description: com.loong.learnjava.filter 24.SpringMVC
 * @Date: create in 2020.6.5 10:51
 */
@Component
public class AuthFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletResponse res = (HttpServletResponse) servletResponse;
        res.setHeader("lizhilong", "123");

        /*if (authHeader != null && authHeader.startsWith("Basic ")) {
            System.out.println(authHeader);

        }
        req.getSession().setAttribute(UserController.KEY_USER, authHeader);*/

        System.out.println("过滤器执行");

        filterChain.doFilter(servletRequest, servletResponse);
    }
}
