package com.loong.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test7 {
    public static void main(String[] args) {

        // 创幻线程池对象
        ExecutorService service = Executors.newFixedThreadPool(2);

        MyRunnable01 mr = new MyRunnable01();

        service.submit(mr);
        service.submit(mr);
        service.submit(mr);
    }
}
