package com.loong.learnjava.IOC.service;

import com.loong.learnjava.IOC.Annotation.MetricTime;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class UserService {
    @Autowired
    private MailService mailService;
    @Autowired
    private DataSource dataSource;

    public void setMailService(MailService mailService) {
        this.mailService = mailService;
    }

    public User login(String email, String password) throws SQLException {
        Connection con = dataSource.getConnection();
        String sql = "select * from user where email = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, email);
        ResultSet resultSet = ps.executeQuery();

        while (resultSet.next()) {
            long id = resultSet.getLong("id");
            String name = resultSet.getString("name");
            String email1 = resultSet.getString("email");
            String password1 = resultSet.getString("password");
            int age = resultSet.getInt("age");
            String sex = resultSet.getString("sex");
            User user = new User(id, email1, password1, name, age, sex);
            if (user.getPassword() != null && user.getPassword().equals(password)) {
                mailService.sendLoginMail(user);
                return user;
            } else {
                throw new RuntimeException("password is error");
            }
        }
        throw new RuntimeException("login failed..");
    }

    @MetricTime("register")
    public void register(String email, String password, String name) {
        System.out.println(name);
    }

    public void setDataSource(HikariDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public DataSource getDataSource() {
        return this.dataSource;
    }
}
