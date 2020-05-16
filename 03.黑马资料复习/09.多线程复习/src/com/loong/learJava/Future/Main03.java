package com.loong.learJava.Future;

import java.util.concurrent.CompletableFuture;

public class Main03 {
    public static void main(String[] args) throws Exception {
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            return queryCode("你好", "url1");
        });

        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            return queryCode("123", "url2");
        });

        CompletableFuture<Object> all = CompletableFuture.anyOf(future1, future2);

        CompletableFuture<Double> future3 = all.thenApplyAsync((code) -> {
            return fetchPrice((String) code, "ur3");
        });

        CompletableFuture<Double> future4 = all.thenApplyAsync((code) -> {
            return fetchPrice((String) code, "url4");
        });

        CompletableFuture<Object> all1 = CompletableFuture.anyOf(future3, future4);

        all1.thenAccept((a) -> {
            System.out.println("price" + a);
        });

        Thread.sleep(2000);
    }

    static String queryCode(String name, String url) {
        System.out.println("query code from " + url + "...");
        try {
            Thread.sleep((long) (Math.random() * 100));
        } catch (InterruptedException e) {
        }
        return "601857";
    }

    static Double fetchPrice(String code, String url) {
        System.out.println("query price from " + url + "...");
        try {
            Thread.sleep((long) (Math.random() * 100));
        } catch (InterruptedException e) {
        }
        return 5 + Math.random() * 20;
    }
}
