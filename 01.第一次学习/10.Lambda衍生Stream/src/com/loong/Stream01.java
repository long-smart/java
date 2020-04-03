package com.loong;

import java.util.ArrayList;
import java.util.List;

public class Stream01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.stream().filter(item -> item > 2).forEach(System.out::println);
        System.out.println(list);
    }
}