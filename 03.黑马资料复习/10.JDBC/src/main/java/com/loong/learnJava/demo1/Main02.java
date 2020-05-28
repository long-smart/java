package com.loong.learnJava.demo1;

import java.util.Arrays;

public class Main02 {
    public static void main(String[] args) {
        String[] strings = {"1", "2", "3"};
        String[] array = new String[] { "Apple", "Orange", "Banana", "Lemon" };
        Arrays.sort(array, String::compareTo);
        System.out.println(Arrays.toString(array));

    }
}
