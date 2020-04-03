package com.loong.SetMap;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class SetListMapTest {
    public static void main(String[] args) {
        Set<String> str1 = Set.of("a", "b", "c");
        // str1.add("c") // 报错
        System.out.println(str1);
        Map<String, Integer> map = Map.of("a", 0, "b", 1, "c", 2);

        System.out.println(map);

        List<String> list = List.of("1", "2", "3", "4");

        System.out.println(list);
    }
}
