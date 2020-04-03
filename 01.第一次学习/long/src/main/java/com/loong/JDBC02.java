package com.loong;

import java.sql.*;

public class JDBC02 {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/learnjdbc?useSSL=false&characterEncoding=utf8&serverTimezone=GMT%2B8";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "123456";

    public static void main(String[] args) throws Exception {
        getStudentById(2);
        insertStudent();
    }

    public static void getStudentById(int id) throws Exception {
        Connection con = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
        // 拼接sql语句, 可能会出现sql注入
        // ResultSet rs = smt.executeQuery("select * from students where id = " + id);
        String sql = "select * from students where id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setObject(1, id);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            String name = rs.getString(2);
            System.out.println(name);
        }


        rs.close();
        con.close();
    }

    public static void insertStudent() throws Exception {
        Connection con = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
        String sql = "insert into students (grade, name, gender, score) VALUES (?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setObject(1, 1);
        ps.setObject(2, "李智龙");
        ps.setObject(3, 1);
        ps.setObject(4, 99);

        int n = ps.executeUpdate();
        System.out.println(n);
    }
}
