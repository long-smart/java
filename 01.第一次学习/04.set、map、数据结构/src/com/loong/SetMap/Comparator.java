package com.loong.SetMap;

import java.util.ArrayList;
import java.util.Collections;

public class Comparator {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.sort(new java.util.Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        Collections.addAll(list, 10, 2, 1, 5, 4, 7, 3);
        System.out.println(list);

//        Collections.sort(list, new java.util.Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        });

        System.out.println(list);
    }
}
