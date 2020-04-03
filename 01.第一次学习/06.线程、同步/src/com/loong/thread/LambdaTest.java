package com.loong.thread;

public class LambdaTest {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("多线程任务执行")).start();


    }
}
