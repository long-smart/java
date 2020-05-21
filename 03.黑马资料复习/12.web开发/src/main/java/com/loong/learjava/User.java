package com.loong.learjava;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/user")
public class User extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        School school = new School("光华中学", "涉县");
        Student student = new Student("龙", 12, school);

        req.setAttribute("user", student);
        req.getRequestDispatcher("/WEB-INF/user.jsp").forward(req, resp);
    }
}
