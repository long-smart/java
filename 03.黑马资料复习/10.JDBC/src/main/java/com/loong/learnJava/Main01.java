package com.loong.learnJava;

import java.sql.*;

public class Main01 {
    public static void main(String[] args) throws Exception {
        // JDBC连接的URL, 不同数据库有不同的格式:
        String JDBC_URL = "jdbc:mysql://localhost:3306/learnjdbc?serverTimezone=GMT%2B8";
        String JDBC_USER = "root";
        String JDBC_PASSWORD = "123456";

        Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
        PreparedStatement ps = conn.prepareStatement("SELECT id, grade, name, gender FROM students WHERE gender=? AND grade=?");
        ps.setObject(1, 1); // 注意：索引从1开始
        ps.setObject(2, 1);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            long id = rs.getLong("id");
            long grade = rs.getLong("grade");
            String name = rs.getString("name");
            String gender = rs.getString("gender");
            System.out.print(id);
            System.out.print(grade);
            System.out.print(name);
            System.out.print(gender);
            System.out.println();
        }
    }
}
