package com.loong.learJava.Pool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main02 {
    public static void main(String[] args) {
        ScheduledExecutorService es = Executors.newScheduledThreadPool(4);
        es.scheduleAtFixedRate(new Task("fixed-rate"),2, 1, TimeUnit.SECONDS);
//        es.shutdown();
    }
}
