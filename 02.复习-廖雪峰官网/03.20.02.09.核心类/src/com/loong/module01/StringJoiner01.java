package com.loong.module01;

import java.util.StringJoiner;

public class StringJoiner01 {
    public static void main(String[] args) {
        String[] names = {"Bob", "Alice", "Grace"};
        System.out.println(String.join(", ", names));
        var sj = new StringJoiner(", ", "hello ", "!");

        for (String name : names) {
            sj.add(name);
        }
        System.out.println(sj.toString());
    }

    private static void demo() {
        String[] names = {"Bob", "Alice", "Grace"};
        var sb = new StringBuilder();
        sb.append("Hello ");
        for (String name : names) {
            sb.append(name).append(", ");
        }
        // 注意去掉最后的", ":
        sb.delete(sb.length() - 2, sb.length());
        sb.append("!");
        System.out.println(sb.toString());
    }
}
