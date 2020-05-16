package com.loong.learJava.Pool;

import java.util.concurrent.*;

public class Main03 {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(5);
        Callable<String> task = new Task01();

        for (int i = 0; i < 5; i++) {
            Future<String> future = es.submit(task);

            try {
                String result = future.get();
                System.out.println(result);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        es.shutdown();
    }
}
