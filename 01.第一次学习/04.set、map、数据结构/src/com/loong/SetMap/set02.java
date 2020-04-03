package com.loong.SetMap;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class set02 {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();

        set.add("0");
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");

        System.out.println(set);

        Iterator<String> it = set.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
