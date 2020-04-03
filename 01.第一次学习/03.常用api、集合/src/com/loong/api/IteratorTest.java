package com.loong.api;

import java.util.ArrayList;
import java.util.Collection;

public class IteratorTest {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();

        // 添加元素到集合
        coll.add("串串星人");
        coll.add("吐槽星人");
        coll.add("汪星人");

        for (String s : coll) {
            System.out.println(s);
        }
    }
}
