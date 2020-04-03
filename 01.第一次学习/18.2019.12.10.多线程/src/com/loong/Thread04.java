package com.loong;

public class Thread04 {

    /*
        synchronized代码块可以实现线程同步
        JVM规范定义了几种原子操作：(不需要 synchronized)
            基本类型（long和double除外）赋值，例如：int n = m；
            引用类型赋值，例如：List<String> list = anotherList。
     */
    public static void main(String[] args) throws Exception {
//        Thread add = new MyThread03();
//        Thread dec = new MyThread04();
//        add.start();
//        dec.start();
//        add.join();
//        dec.join();
//        System.out.println("end");
//        System.out.println(Count.count);
    }
}


class Count {
    static final Object lock = new Object();
    static int count = 0;
}

class MyThread03 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            synchronized (Count.lock) {
                Count.count += i;
                System.out.println(Count.count);
            }
        }
    }
}

class MyThread04 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            synchronized (Count.lock) {
                Count.count -= i;
                System.out.println(Count.count);
            }
        }
    }
}

