package cn.loong.java;

import java.util.function.Supplier;

public class Func01 {
    public static void func1(Supplier<Integer> sup) {
        sup.get();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        func1(() -> {
            int max = arr[0];
            for (int i : arr) {
                if (i > max) {
                    max = i;
                }
            }
            System.out.println(max);
            return max;
        });
    }
}
