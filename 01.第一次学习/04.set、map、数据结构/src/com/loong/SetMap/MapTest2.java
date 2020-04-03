package com.loong.SetMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest2 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("赵丽颖", "*****");
        map.put("杨幂", "****");
        map.put("迪丽热巴", "*****");

        Set<Map.Entry<String, String>> entry = map.entrySet();

//        map.forEach((k,v)->{
//            System.out.println(k);
//            System.out.println(v);
//        });
        for (Map.Entry<String, String> entry1 : entry) {
            System.out.println(entry1);
            System.out.println(entry1.getKey());
            System.out.println(entry1.getValue());
        }
    }
}
