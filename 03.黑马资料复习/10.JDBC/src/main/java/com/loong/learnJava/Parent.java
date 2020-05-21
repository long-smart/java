package com.loong.learnJava;

import java.util.ArrayList;
import java.util.List;

public class Parent {
    List<String> list = new ArrayList<>();

    public Parent() {
        System.out.println("父类构造函数执行");
    }

    public void add(String a) {
        list.add(a);
    }
}
