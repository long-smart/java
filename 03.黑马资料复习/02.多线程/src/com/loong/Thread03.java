package com.loong;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Thread03 implements Runnable {
    private int num = 100;
    final Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            lock.lock();
            if (num > 0) {
//                try {
//                    Thread.sleep(100);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
                String name = Thread.currentThread().getName();
                System.out.println(name + "正在卖" + num--);
            } else {
                break;
            }
            lock.unlock();
        }
    }
}
