package com.loong.learnJava;

import java.util.ArrayList;

public class Main03 {
    public static final ArrayList<String> as = new ArrayList<String>() {
        {
            add("123");
            add("456");
        }
    };

    public static void main(String[] args) {
        for (String str: as) {
            System.out.println(str);
        }
    }
}
