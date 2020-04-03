package com.loong.thread;

public class Test2 {
    public static void main(String[] args) {
        MyRunnable mr1 = new MyRunnable();
        MyRunnable mr2 = new MyRunnable();

        Thread t1 = new Thread(mr1, "线程一");
        Thread t2 = new Thread(mr2, "线程二");

        t1.start();
        t2.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("main线程" + i);
        }
    }
}
