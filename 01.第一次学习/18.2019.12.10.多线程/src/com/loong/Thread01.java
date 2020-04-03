package com.loong;

public class Thread01 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main线程开始");
        Thread th1 = new Thread(() -> System.out.println("thread1开始"));
        th1.start();
        th1.join(); // 等待th1线程执行完毕之后再执行， 也可以传入毫秒数 代表最多等待多长时间
        System.out.println("main线程结束");
    }
}
