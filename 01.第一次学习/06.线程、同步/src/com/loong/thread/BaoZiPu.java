package com.loong.thread;

public class BaoZiPu extends Thread{
    private BaoZi baoZi;

    public BaoZiPu(String name, BaoZi baoZi) {
        super(name);
        this.baoZi = baoZi;
    }

    @Override
    public void run() {
        int count = 0;
        while (true) {
            synchronized (baoZi) {
                if (baoZi.flag == true) {
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }

                System.out.println("没有包子");
                if (count % 2 == 0) {
                    baoZi.pier = "冰皮";
                    baoZi.xianer = "五仁";
                } else {
                    baoZi.pier = "薄皮";
                    baoZi.xianer = "牛肉大葱";
                }
                baoZi.flag = true;
                System.out.println("包子造好了： " + baoZi.pier + baoZi.xianer);

                baoZi.notify();
            }
        }
    }
}
