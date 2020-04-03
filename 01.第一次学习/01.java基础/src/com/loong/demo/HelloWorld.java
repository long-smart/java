package com.loong.demo;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello world");
        print();
        System.out.println(getSum(1, 2));
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    private static void print() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static int getSum(int a, int b) {
        return a + b;
    }
}

