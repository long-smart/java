package com.loong.api;

import java.util.Arrays;
import java.util.Date;

public class SystemTest {
    public static void main(String[] args) {
        // 获取当前的时间戳
        /*long start = System.currentTimeMillis();
        System.out.println(start);

        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }

        long end = System.currentTimeMillis();

        System.out.println(end);

        System.out.println("耗时" + (end - start));*/

        // 拷贝数组
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6, 4, 5, 6};

        // arraycopy(源数组, 开始索引, 目标数组, 开始索引, 个数)
        System.arraycopy(arr1, 0, arr2, 0, 3);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
