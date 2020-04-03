package com.loong.SetMap;

public class args {
    public static void main(String[] args) {
        int sum = getSum(1, 2, 3, 4, 5);
        System.out.println(sum);
    }

    public static int getSum(int... nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        return sum;
    }
}
