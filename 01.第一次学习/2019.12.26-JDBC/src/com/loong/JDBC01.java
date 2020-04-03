package com.loong;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC01 {

    public static void main(String[] args) throws Exception {
        // 注册驱动
//        Class.forName("com.mysql.jdbc.Driver");
        // 获取数据库连接对象
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1?serverTimezone=GMT%2B8", "root", "123456");
        // 定义sql语句
        String sql = "select * from dept";
        Statement stmt = con.createStatement();

        ResultSet resultSet = stmt.executeQuery(sql);

        while (resultSet.next()) {
            System.out.println(resultSet.getString("name"));
        }

        stmt.close();
        con.close();
    }
}
