package com.loong.learnjdbc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@Component
public class UserService {
    @Autowired
    private MailService mailService;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public boolean login(String email, String password) throws Exception {
        String sql = "select * from users where email=?";
        User user = jdbcTemplate.queryForObject(sql, new Object[]{email}, (ResultSet rs, int rowNum) -> {
            if (rs.next()) {
                return new User(
                        rs.getLong("id"),
                        rs.getString("email"),
                        rs.getString("password"),
                        rs.getString("name")
                );
            }
            return null;
        });
        if (user != null) {
            if (user.getPassword().equals(password)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public User getUserById(long id) {
        // 注意传入的是ConnectionCallback:

        return jdbcTemplate.execute((Connection conn) -> {
            // 可以直接使用conn实例，不要释放它，回调结束后JdbcTemplate自动释放:
            // 在内部手动创建的PreparedStatement、ResultSet必须用try(...)释放:
            try (PreparedStatement ps = conn.prepareStatement("SELECT * FROM users WHERE id = ?")) {
                ps.setObject(1, id);
                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        return new User( // new User object:
                                rs.getLong("id"), // id
                                rs.getString("email"), // email
                                rs.getString("password"), // password
                                rs.getString("name")); // name
                    }
                    throw new RuntimeException("user not found by id.");
                }
            }
        });
    }

    public void register(String email, String password, String name) throws Exception {
        System.out.println(name);
        String sql = "insert into users(email, password, name) values(?, ?, ?)";

        jdbcTemplate.execute(sql, (PreparedStatement ps) -> {
            ps.setString(1, email);
            ps.setString(2, password);
            ps.setString(3, name);
            ps.executeUpdate();
            throw new RuntimeException("12314124");
        });
    }


    public MailService getMailService() {
        return mailService;
    }

    public void setMailService(MailService mailService) {
        this.mailService = mailService;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
