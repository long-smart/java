package com.loong.learnjava.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: ZhiLong Li
 * @Description: com.loong.learnjava.interceptor 24.SpringMVC
 * @Date: create in 2020.6.5 12:54
 */
@Component
public class LoggerInterceptor implements HandlerInterceptor {
    Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.info("进入Interceptor, 进入controller之前执行");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        logger.info("进入PostHandle, controller正常返回执行");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        logger.info("进入AfterCompletion, controller执行完毕不管异常与否都会执行");
    }
}
