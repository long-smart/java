package com.loong.threading;

import java.util.Collection;
import java.util.List;

public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + "正在执行" + i);
        }
    }
}
