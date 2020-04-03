package com.loong.thread;

public class Test6 {
    public static void main(String[] args) {
        BaoZi bz = new BaoZi();
        ChiHuo ch = new ChiHuo("吃货", bz);
        BaoZiPu bzp = new BaoZiPu("包子铺", bz);

        ch.start();
        bzp.start();

    }
}
