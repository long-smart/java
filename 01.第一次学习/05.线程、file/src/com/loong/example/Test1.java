package com.loong.example;

public class Test1 {
    public static void main(String[] args) {
        Threading1 th = new Threading1("子线程");
        th.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("main线程" + i);
        }
    }
}
