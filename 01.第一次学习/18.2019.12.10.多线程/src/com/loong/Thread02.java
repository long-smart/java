package com.loong;

public class Thread02 {
    /*
        线程中断：调用 interrupt方法
     */
    public static void main(String[] args) throws Exception {
        Thread t1 = new MyThread();
        t1.start();
        Thread.sleep(1);
        t1.interrupt(); // 中断 t1 线程
        t1.join();
        System.out.println("end");
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        int n = 0;
        while (! isInterrupted()) {
            n ++;
            System.out.println(n + " hello!");
        }
    }
}
