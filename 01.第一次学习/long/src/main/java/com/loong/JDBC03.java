package com.loong;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC03 {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/learnjdbc?useSSL=false&characterEncoding=utf8&serverTimezone=GMT%2B8";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "123456";

    public static void main(String[] args) throws SQLException {
        /*
            事务：
                原子性、隔离性、一致性、持久性
         */
        try (Connection con = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            // 关闭自动提交 (开启事务)
            con.setAutoCommit(false);

            PreparedStatement ps = con.prepareStatement("update students = ");
        }

    }


}
