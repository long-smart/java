package com.loong.SetMap;

import java.util.HashMap;
import java.util.Scanner;

public class MapDemo {
    public static void main(String[] args) {
        System.out.println("请输入字符串:");
        String line = new Scanner(System.in).nextLine();
        findChar(line);
    }

    private static void findChar(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.containsKey(c)) {
                Integer count = map.get(c);
                map.put(c, ++count);
            } else {
                map.put(c, 1);
            }
        }

        System.out.println(map);
    }
}
