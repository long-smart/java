package com.loong;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.OutputStream;

@WebServlet("/demo2")
public class Servlet02 implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("servlet02执行");
        System.out.println(servletRequest);
        OutputStream ops = servletResponse.getOutputStream();
        ops.write("<h1>hello ServeLet</h1>".getBytes());
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }

}
