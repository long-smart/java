package com.loong.example;

public class MyRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(i);
            System.out.println(Thread.currentThread().getName());
        }
    }
}
