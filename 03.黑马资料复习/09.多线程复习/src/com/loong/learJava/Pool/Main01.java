package com.loong.learJava.Pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main01 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        for (int i = 0; i < 6; i++) {
            executor.submit(new Task("task" + i));
        }
        // 关闭线程池:
        executor.shutdown();
    }
}
