package com.loong.SetMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest1 {
    public static void main(String[] args) {
        Map<Student, String> map = new HashMap<>();

        // 添加元素
        map.put(new Student("赵丽颖", 18), "河北");
        map.put(new Student("杨幂", 18), "北京");
        map.put(new Student("迪丽热巴", 18), "北京");
        map.put(new Student("杨超越", 18), "河北");

        Set<Student> keys = map.keySet();

        for (Student key : keys) {
            System.out.println(key.toString());
            System.out.println(map.get(key));
        }
    }
}
