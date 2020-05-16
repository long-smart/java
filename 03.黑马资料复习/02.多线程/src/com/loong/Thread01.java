package com.loong;

public class Thread01 {
    public static void main(String[] args) {
        Child01 child01 = new Child01();
        Thread thread = new Thread(child01, "子线程");
        Thread thread1 = new Child02("子线程01");
        thread1.start();
        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main线程" + i);
        }
    }
}
