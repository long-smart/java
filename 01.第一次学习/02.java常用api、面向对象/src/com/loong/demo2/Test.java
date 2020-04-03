package com.loong.demo2;

public class Test {
    public static void main(String[] args) {
        LapTop lt = new LapTop();
        lt.run();

        USB u = new Mouse();
        lt.useUSB(u);

        keyBoard b = new keyBoard();
        lt.useUSB(b);

        lt.shutdown();
    }
}
