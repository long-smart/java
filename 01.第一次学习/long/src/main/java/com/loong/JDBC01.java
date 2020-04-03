package com.loong;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC01 {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/learnjdbc?useSSL=false&characterEncoding=utf8&serverTimezone=GMT%2B8";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "123456";

    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
        Statement smt = con.createStatement();
        ResultSet rs = smt.executeQuery("select * from students");

        while (rs.next()) {
//            long id = rs.getLong(1); // 注意：索引从1开始
//            long grade = rs.getLong(2);
            String name = rs.getString(2);
//            String gender = rs.getString(4);
            System.out.println(name);
        }
        rs.close();
        smt.close();
        con.close();

    }
}
