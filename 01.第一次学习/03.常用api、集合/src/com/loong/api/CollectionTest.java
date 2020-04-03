package com.loong.api;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        coll.add("你好啊");
        coll.add(123);
        coll.add(456);


        System.out.println(coll);

        coll.remove(456);

        System.out.println(coll);

        System.out.println(coll.contains(123));

        Object[] objects = coll.toArray();

        for (Object object : objects) {
            System.out.println(object);
        }

        coll.clear();

        System.out.println(coll.isEmpty());
    }
}
