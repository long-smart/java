package com.loong;

public class Child02 extends Thread {
    public Child02(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + i);
        }
    }
}
