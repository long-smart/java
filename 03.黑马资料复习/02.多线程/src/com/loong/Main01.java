package com.loong;

public class Main01 {
    public static void main(String[] args) {
        Thread02 thread02 = new Thread02();
        Thread thread = new Thread(thread02, "1");
        Thread thread1 = new Thread(thread02, "2");
        Thread thread2 = new Thread(thread02, "3");

        thread.start();
        thread1.start();
        thread2.start();
    }
}
