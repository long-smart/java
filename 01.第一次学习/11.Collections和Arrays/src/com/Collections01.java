package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collections01 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(2);

        // 排序 正序
//        Collections.sort(arr);
//        // 反转
//        Collections.reverse(arr);
//        // 打乱顺序
//        Collections.shuffle(arr);

        // 1 和 2更换顺序
        Collections.swap(arr, 1, 2);

    }
}
