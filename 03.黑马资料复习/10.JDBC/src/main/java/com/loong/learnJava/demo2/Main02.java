package com.loong.learnJava.demo2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Main02 {
    public static void main(String[] args) throws SQLException {
        Connection conn = Utils.getConnection();
        Statement statement = conn.createStatement();
        String sql = "update students set score = 100 where id=13";
        String sql2 = "update students set score = 0 where id=7";
        statement.addBatch(sql);
        statement.addBatch(sql2);

        statement.executeBatch();
        statement.clearBatch();
        Utils.release(conn, statement, null);
    }
}
