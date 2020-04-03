package com.loong.api;

import java.util.Arrays;

public class testArrays {
    public static void main(String[] args) {
        int[] arr = {4, 2, 10, 6, 8, 16, 12, 14, 18, 20};

        // 将数组转化为字符串
        String s = Arrays.toString(arr);

        System.out.println(s);

        // 将数组按升序排列
        Arrays.sort(arr);

        String s2 = Arrays.toString(arr);
        System.out.println(s2);
    }
}
