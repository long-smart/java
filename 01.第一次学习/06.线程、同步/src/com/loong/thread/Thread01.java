package com.loong.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Thread01 implements Runnable {
    private int ticket = 100;

    Lock lock = new ReentrantLock();
    // 使用Lock锁来实现线程同步
    @Override
    public void run() {
        while (true) {
            lock.lock();
            if (ticket > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                String name = Thread.currentThread().getName();
                System.out.println(name + "正在卖" + ticket--);
            }

            lock.unlock();
        }
    }

    //    @Override
//    public void run() {
//        while (true) {
//            sellTicket();
//        }
//    }
//    // 使用同步方法实现线程同步
//    public synchronized void sellTicket() {
//        if (ticket > 0) {
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//            String name = Thread.currentThread().getName();
//            System.out.println(name + "正在卖" + ticket--);
//        }
//    }
//***********************************************************************************************

    //    @Override
//    public void run() {
//        while (true) {
//            // 同步代码块实现线程同步
//            synchronized (obj) {
//                if (ticket > 0) {
//                    try {
//                        Thread.sleep(100);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//
//                    String name = Thread.currentThread().getName();
//                    System.out.println(name + "正在卖" + ticket--);
//                }
//            }
//        }
//    }
}
