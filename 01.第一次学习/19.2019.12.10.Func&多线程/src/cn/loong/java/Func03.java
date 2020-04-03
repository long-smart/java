package cn.loong.java;

import java.util.function.Predicate;

public class Func03 {
    /*
        Predicate 接口 用于判断 (test or || and && negate !)
     */
    private static boolean func1(String str, Predicate<String> predicate) {
        return predicate.test(str);
    }

    public static void main(String[] args) {
        String s = "12345";
        boolean b = func1(s, str -> str.length() >= 5);
        System.out.println(b);
    }

    public static int getSum(int a, int b) {
        return a + b;
    }
}
