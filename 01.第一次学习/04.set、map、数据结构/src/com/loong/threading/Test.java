package com.loong.threading;

public class Test {
    public static void main(String[] args) {
        MyThread thread = new MyThread("甲");
        MyThread thread1 = new MyThread("乙");

        thread.start();
        thread1.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("主线程" + i);
        }
    }
}
