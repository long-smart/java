package com.loong.SetMap;

import java.util.HashSet;

public class Set01 {
    public static void main(String[] args) {
        /**
         *  HashSet 无序, 若想让HashSet存储自定义对象, 需要重写 equals 和 hashcode方法
         */
        HashSet<String> set = new HashSet<>();

        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");
        set.add(new String("4"));

        for (String i : set) {
            System.out.println(i);
        }
    }
}
