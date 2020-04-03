package com.loong.example;

public class Test2 {
    public static void main(String[] args) {
        MyRunnable mt = new MyRunnable();
        // 创建线程对象
        Thread t = new Thread(mt, "子线程1");
        Thread t1 = new Thread(mt, "子线程2");
        t.start();
        t1.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("main线程执行" + i);
        }

        System.out.println(getSum(2, 2, 2, 2, 2));
    }

    private static int getSum(int... arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

}