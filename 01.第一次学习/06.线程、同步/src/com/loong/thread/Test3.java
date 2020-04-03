package com.loong.thread;

public class Test3 {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + i);
                }
            }
        };

        new Thread(r, "线程1").start();

        for (int i = 0; i < 10; i++) {
            System.out.println("main线程" + i);
        }
    }
}
