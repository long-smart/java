package com.loong.FileTest;

public class DiGuiGetSum {
    public static void main(String[] args) {
        System.out.println(getSum(10000));
    }

    private static int getSum(int num) {
        if (num == 1) {
            return 1;
        }

        return num + getSum(num - 1);
    }

    private static int getValue(int num) {
        if (num == 1) {
            return 1;
        }

        return num * getValue(num - 1);
    }
}
