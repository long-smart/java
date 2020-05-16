package com.loong.Demo01;

public class Main {
    public static void main(String[] args) {
        Object obj = new Object();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (obj) {
                        System.out.println(Thread.currentThread().getName() + "进入runable状态");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }, "等待线程").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj) {
                        System.out.println(Thread.currentThread().getName() + "获取到锁, 执行唤醒方法");
                        obj.notify();
                    }
                }
            }
        }, "环形线程").start();
    }
}
