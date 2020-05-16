package com.loong;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexp01 {
    /*
        正则表达式匹配默认使用贪婪匹配，可以使用?表示对某一规则进行非贪婪匹配。
        注意区分?的含义：\d??。
     */
    public static void main(String[] args) {
        String reg = "(\\d{3,4})-(\\d{6,8})";
        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher("010-12345678");

        if (m.matches()) {
            System.out.println(m.group(1));
            System.out.println(m.group(2));
        } else {
            System.out.println("匹配失败");
        }

        find();
    }

    public static void find() {
        String s = "the quick brown fox jumps over the lazy dog.";
        Pattern p = Pattern.compile("\\wo\\w");
        Matcher m = p.matcher(s);
        while (m.find()) {
            String sub = s.substring(m.start(), m.end());
            System.out.println(sub);
        }
    }
}
