package com;

import java.util.*;

public class asList {
    public static void main(String[] args) {
        /*
            Arrays.asList 返回的对象是一个Arrays内部类, 并没有实现集合的修改方法。
            体现的是适配器模式, 只是转换接口, 后台的数据仍是数组。
            所以不能使用集合的add/remove/clear
         */
//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
//
//
//        System.out.println(list.size());

//        int[] arr = {1, 2, 3};
//        List list = Arrays.asList(arr);
//
//        // 不要使用基本数据类型的数组，否则集合的第一项是 arr数组
//        System.out.println(list.size());
//
//        int[] arr2 = (int[]) list.get(0);
//        System.out.println(Arrays.toString(arr2));

        /*
            不要在foreach里执行 remove/add 操作
            fail-fast 机制 ：多个线程对 fail-fast 集合进行修改的时，可能会抛出ConcurrentModificationException，单线程下也会出现这种情况，上面已经提到过。
         */

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

//        for (String item : list) {
//            if ("1".equals(item)) {
//                list.remove("1");
//            }
//        }
//        System.out.println(list);

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if ("1".equals(it.next())) {
                it.remove();
            }
        }
        System.out.println(list);
    }
}
