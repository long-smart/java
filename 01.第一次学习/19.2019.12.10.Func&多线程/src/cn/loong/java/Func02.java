package cn.loong.java;

import java.util.function.Consumer;

public class Func02 {
    /*
        Consumer 消费型接口，无返回值
     */
    public static void func1(String str, Consumer<String> one, Consumer<String> two) {
        one.andThen(two).accept(str);
    }

    public static void main(String[] args) {
        String str = "abcDEF";
        func1(str, (str1) -> {
            System.out.println(str1.toLowerCase());
        }, (str1) -> {
            System.out.println(str1.toUpperCase());
        });
    }
}
