package com.loong;

import java.util.Arrays;

public class Stream04 {
    private static final int result = 0;

    public static void main(String[] args) {
        initArray(10, length -> new int[length]);
        initArray(11, int[]::new);

        double d = 1.123;
        int a = 1;


        String str = String.valueOf(a);
        System.out.println(str);


        System.out.println(getSum(8, 8, 8));

    }

    private static void initArray(int len, ArrayBuilder arrayBuilder) {
        System.out.println(Arrays.toString(arrayBuilder.buildArray(len)));
    }


    private static int getSum(int... arr) {
        int result = 0;
        for (int value : arr) {
            result += value;
        }
        return result;
    }
}
