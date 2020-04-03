package com.loong.demo;

public class ArrayIndex {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] arr1 = arr;
        arr1[0] = 2;

        System.out.println(arr[0]);
        System.out.println(arr1[0]);

    }
}
