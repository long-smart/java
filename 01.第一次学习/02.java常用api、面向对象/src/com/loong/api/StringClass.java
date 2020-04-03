package com.loong.api;

public class StringClass {
    public static void main(String[] args) {
        String s1 = "String is Object type";
        System.out.println(s1);
        // 获取length
        System.out.println(s1.length());

        // 将 指定字符串 合并到字符串末尾, 返回合并后的字符串(不会修改原字符串)
        s1 = s1.concat(";");

        System.out.println(s1);

        // 返回指定索引上的字符
        System.out.println(s1.charAt(s1.length() - 1));

        // 返回指定字符串在当前字符串中第一次出现的位置，不存在返回 -1
        System.out.println(s1.indexOf(";"));

        // 截取字符串
        System.out.println(s1.substring(4, 10));

        // 将字符转转为字符数组
        char[] charts = s1.toCharArray();
        for (int c=0; c<charts.length; c++) {
            System.out.print(charts[c]);
        }

        // 将字符串转为字节数组
        byte[] bytes = s1.getBytes();
        System.out.println(bytes);

        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        // 将指定字符串替换为新的字符串
        String replace = s1.replace(";", "!!!!");

        System.out.println(replace);

        // 分割字符串
        String s2 = "aa|bb|cc";
        String[] s2Arr = s2.split("\\|");
        System.out.println(s2Arr);
        for (int i=0; i<s2Arr.length; i++) {
            System.out.println(s2Arr[i]);
        }
    }
}
