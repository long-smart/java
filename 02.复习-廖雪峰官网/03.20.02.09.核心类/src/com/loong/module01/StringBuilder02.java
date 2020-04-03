package com.loong.module01;

public class StringBuilder02 {
    public static void main(String[] args) {
        String[] fields = { "name", "position", "salary" };
        String table = "employee";
        String insert = buildInsertSql(table, fields);
        String s = "INSERT INTO employee (name, position, salary) VALUES (?, ?, ?)";
        System.out.println(s.equals(insert) ? "测试成功" : "测试失败");
    }

    private static String buildInsertSql(String table, String[] fields) {
        String str = String.join(", ", fields);
        // "INSERT INTO () VALUES (?, ?, ?)"
        StringBuilder result = new StringBuilder();
        result.append("INSERT INTO ").append(table).append(" (").append(str).append(")").append(" VALUES (?, ?, ?)");
        System.out.println(result);
        return result.toString();
    }
}
