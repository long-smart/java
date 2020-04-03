package com.loong.thread;

public class Test4 {
    public static void main(String[] args) {
        Thread01 ticket = new Thread01();

        Thread t1 = new Thread(ticket, "窗口一");
        Thread t2 = new Thread(ticket, "窗口二");
        Thread t3 = new Thread(ticket, "窗口三");

        t1.start();
        t2.start();
        t3.start();
    }

}

