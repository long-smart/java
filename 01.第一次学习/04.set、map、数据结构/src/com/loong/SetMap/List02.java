package com.loong.SetMap;

import java.util.LinkedList;

public class List02 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("1");
        list.addFirst("0");
        list.add("2");

        String first = list.getFirst();
        String last = list.getLast();

        System.out.println(list);

        first = list.removeFirst();
        last = list.removeLast();
//        while (!list.isEmpty()) {
//            System.out.println(list.pop());
//        }
        System.out.println(first);
        System.out.println(last);
        System.out.println(list);

    }
}
