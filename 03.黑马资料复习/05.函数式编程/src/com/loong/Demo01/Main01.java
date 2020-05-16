package com.loong.Demo01;

import java.util.function.Consumer;

public class Main01 {
    public static void main(String[] args) {
        String[] arr = {"迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男"};
        printInfo((info) -> {
            String name = info.split(",")[0];
            System.out.println(name);
        }, (info) -> {
            String name = info.split(",")[1];
            System.out.println(name);
        }, arr);
    }


    private static void printInfo(Consumer<String> one, Consumer<String> two, String[] arr) {
        for (String info : arr) {
            one.andThen(two).accept(info);
        }
    }
}
