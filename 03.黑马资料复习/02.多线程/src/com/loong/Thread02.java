package com.loong;

public class Thread02 implements Runnable {
    private int num = 100;
    final Object object = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (object) {
                if (num > 0) {
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    String name = Thread.currentThread().getName();
                    System.out.println(name + "正在卖" + num--);
                } else {
                    break;
                }
            }

        }
    }
}
