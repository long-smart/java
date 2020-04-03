package com.loong.SetMap;

import java.util.*;

public class CollectionUtil {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Collections.addAll(list, 5, 3, 1, 2, 4, 6, 2, 10);

        Collections.sort(list);
        System.out.println(list);
    }
}
