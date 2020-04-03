package com.loong.api;

public class StringTest {
    public static void main(String[] args) {
        // 字符串在Java中是常量, 下面相当于在内存中有3个字符串, "hello", "world", "hello world"
        // 这样很耗时间
        // String str = "hello";
        // str += "world";

        // StringBuilder又称为可变字符序列，它是一个类似于 String 的字符串缓冲区，通过某些方法调用可以改变该序列的长度和内容。
        // StringBuilder内部有一个数组,当执行拼接字符串时, 直接在这个数组中操作。这样就不会生成新的字符串

        StringBuilder str1 = new StringBuilder("hello");
        StringBuilder str2 = new StringBuilder();

        System.out.println(str1);
        System.out.println(str2);

        // 添加(可以添加任何类型), 并返回自身字符串对象
        str2.append("world");

        String str3 = str2.toString();

        str2.append(true);

        str1.append(str2).append("链式调用");

        System.out.println(str2);
        System.out.println(str1);

        String strNum = "1001";
        int num = Integer.parseInt(strNum);


        System.out.println(num);
    }
}
