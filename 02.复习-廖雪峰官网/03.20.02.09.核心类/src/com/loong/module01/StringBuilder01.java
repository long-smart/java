package com.loong.module01;

/*
    String 每次修改都会生成一个新的字符串对象
    StringBuilder是可变对象，用来高效拼接字符串
    StringBuilder可以支持链式操作，实现链式操作的关键是返回实例本身；
    StringBuffer是StringBuilder的线程安全版本，现在很少使用。
 */
public class StringBuilder01 {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder(1024);

//        for (int i = 0; i < s1.length(); i++) {
//            s1.append(",");
//            s1.append(i);
//        }

        s1.append(1);
        s1.append(2);
        s1.append(3);

        // String str = "123";
        // System.out.println(str.equals(s1.toString()));
        // String s2 = s1.toString();
        // System.out.println(s2);

        StringBuilder s2 = new StringBuilder();
        s2.append(1);
        s2.append(2);
        s2.append(3);

        // System.out.println(s2.toString().equals(s1.toString()));

        s2.append(4).append(5).append(6).insert(0, 0);

        System.out.println(s2);
    }
}
