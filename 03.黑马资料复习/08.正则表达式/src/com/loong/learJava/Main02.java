package com.loong.learJava;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main02 {
    public static void main(String[] args) {
        // split分隔字符串
        String str1 = "a,b,c,d,e";
        String[] arr1 = str1.split(",");

        System.out.print(Arrays.toString(arr1));

        // 搜索字符串
        String s = "the quick brown fox jumps over the lazy dog.";
        Pattern p = Pattern.compile("\\wo\\w");
        Matcher m = p.matcher(s);
        while (m.find()) {
            String sub = s.substring(m.start(), m.end());
            System.out.println(sub);
        }

        String s1 = "The     quick\t\t brown   fox  jumps   over the  lazy dog.";
        String r = s.replaceAll("\\s+", " ");
        System.out.println(r); // "The quick brown fox jumps over the lazy dog."

        // 反向引用
        String s2 = "the quick brown fox jumps over the lazy dog.";
        String r1 = s2.replaceAll("\\s([a-z]{4})\\s", " <b>$1</b> ");
        System.out.println(r1);

        BigInteger a = new BigInteger(1, "10".getBytes());
        System.out.println(a.toString(16));
    }
}
