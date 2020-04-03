package com.loong.thread;

public class Test {

    public static void main(String[] args) {
        MyThread t1 = new MyThread("线程一");
        MyThread t2 = new MyThread("线程二");

        t1.start();
        t2.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("main线程" + i);
        }
    }

}
