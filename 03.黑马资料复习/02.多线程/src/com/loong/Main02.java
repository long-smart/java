package com.loong;

public class Main02 {
    public static void main(String[] args) {
        Thread03 thread03 = new Thread03();
        Thread thread1 = new Thread(thread03, "1");
        Thread thread2 = new Thread(thread03, "2");
        Thread thread3 = new Thread(thread03, "3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
