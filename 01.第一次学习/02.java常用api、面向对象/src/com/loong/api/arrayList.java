package com.loong.api;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        /**
         *  ArrayList不能存储基本数据类型，要想存储基本数据类型， 需要使用对应的包装类
         *  byte Byte
         *  short Short
         *  int Integer
         *  long Long
         *  float Float
         *  double Double
         *  char Character
         *  boolean Boolean
         */
        ArrayList<String> strs = new ArrayList<>();

        String s1 = "曹操";
        String s2 = "刘备";
        String s3 = "孙权";

        System.out.println(strs);

        // 添加元素至末尾
        strs.add(s1);
        strs.add(s2);
        strs.add(s3);

        // get 通过下标获取元素
        System.out.println(strs.get(2));

        for (int i=0; i<strs.size(); i++) {
            System.out.println(strs.get(i));
        }

        // 通过下标删除元素
        strs.remove(2);

        System.out.println(strs);

        // 存储基本数据类型
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);

        System.out.println(numbers);
    }
}
