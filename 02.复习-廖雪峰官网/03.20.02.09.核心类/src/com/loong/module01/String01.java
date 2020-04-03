package com.loong.module01;

public class String01 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "cd", s3 = "CD";

        System.out.println(s1.toLowerCase());
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s2.equals(s3));
        // 忽略大小写比较
        System.out.println(s2.equalsIgnoreCase(s3));

        String[] arr = {"1", "2", "3", "4"};
        System.out.println(String.join(",", arr));


        char[] cs = "Hello".toCharArray();
        String s = new String(cs);
        System.out.println(s);
        cs[0] = 'X';
        System.out.println(s);
        System.out.println(cs);
    }
}
