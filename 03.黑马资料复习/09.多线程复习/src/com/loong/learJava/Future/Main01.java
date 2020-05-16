package com.loong.learJava.Future;

import java.util.concurrent.CompletableFuture;

public class Main01 {
    public static void main(String[] args) throws Exception {
        CompletableFuture<Double> cf = CompletableFuture.supplyAsync(Main01::fetchPrice);
        // 执行成功
        cf.thenAccept((result) -> {
            System.out.print("price" + result);
        });

        // 执行失败
        cf.exceptionally((e) -> {
            e.printStackTrace();
            return null;
        });

        Thread.sleep(200);
    }

    static Double fetchPrice() {
        try {
            Thread.sleep(100);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (Math.random() < 0.3) {
            throw new RuntimeException("fetch price failed!");
        }
        return 5 + Math.random() * 20;
    }
}
