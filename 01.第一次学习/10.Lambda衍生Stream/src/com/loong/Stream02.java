package com.loong;

public class Stream02 {
    public static void main(String[] args) {
        method(-11, Math::abs); // 方法引用
        method(100, num -> Math.abs(num)); // lambda表达式(两者效果一样)
    }

    private static void method(int num, Calcable lambda) {
        int result = lambda.calc(num);
        System.out.println(result);
    }

    
}
