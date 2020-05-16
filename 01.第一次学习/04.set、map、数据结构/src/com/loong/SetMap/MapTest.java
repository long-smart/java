package com.loong.SetMap;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class MapTest {
    public static void main(String[] args) throws IOException {

        HashMap<String, String> map = new HashMap<>();
        // 添加键值对。 如果key已存在就替换掉， 并返回替换的key 的 值。如果不存在那就添加key和value，并返回null
        map.put("name", "小明");
        map.put("age", "18");

        System.out.println(map);

        System.out.println(map.remove("age"));

        System.out.println(map);

        System.out.println(map.get("name"));

        HashMap<String, String> map1 = new HashMap<>();

        map1.put("赵丽颖", "99999");
        map1.put("杨幂", "999");
        map1.put("迪丽热巴", "9999");
        map1.put("杨超越", "99999");

        System.out.println(map1);

        Set<String> keys = map1.keySet();

        for (String key : keys) {
            System.out.println(map1.get(key));
        }

    }
}
