package com.loong.learnJava;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

@WebServlet(value = "/servlet06", initParams = {
    @WebInitParam(name = "name", value = "servlet06")
})
public class Servlet06 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletConfig config = getServletConfig();
        String name = config.getInitParameter("name");
//        PrintWriter pw = resp.getWriter();
        OutputStream pw = resp.getOutputStream();
        pw.write(name.getBytes());
        pw.write("\nOutputStream".getBytes());
        pw.close();
    }
}
