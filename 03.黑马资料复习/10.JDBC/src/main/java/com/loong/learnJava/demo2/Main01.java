package com.loong.learnJava.demo2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main01 {
    public static void main(String[] args) throws Exception {
//        String JDBC_URL = "jdbc:mysql://localhost:3306/learnjdbc?serverTimezone=GMT%2B8";
//        String JDBC_USER = "root";
//        String JDBC_PASSWORD = "123456";
//
//        Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
        Connection conn = Utils.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from students where name = ?");
        ps.setString(1, "李智龙");
        ResultSet resultSet = ps.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getString("name"));
        }

        Utils.release(conn, ps, resultSet);
    }
}
