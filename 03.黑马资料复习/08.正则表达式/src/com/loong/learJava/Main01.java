package com.loong.learJava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main01 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("(\\d{3,4})\\-(\\d{7,8})");
        Matcher matcher = p.matcher("010-12345678");
        if (matcher.matches()) {
            System.out.println("校验成功");
            String s1 = matcher.group(1);
            String s2 = matcher.group(2);
            System.out.println(s1);
            System.out.println(s2);
        } else {
            System.out.println("校验失败");
        }

        String str = "010-12345678";
        boolean result = str.matches("(\\d{3,4})\\-(\\d{7,8})");
        System.out.println(result);
    }
}
