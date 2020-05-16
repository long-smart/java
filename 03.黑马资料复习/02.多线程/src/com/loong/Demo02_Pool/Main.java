package com.loong.Demo02_Pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        // 创建线程池对象  Executors提供了快速创建线程池的静态方法
        ExecutorService service = Executors.newFixedThreadPool(2);

        MyRunnable r1 = new MyRunnable();
        service.submit(r1);
        service.submit(r1);
        service.submit(r1);
        service.submit(r1);
    }
}
