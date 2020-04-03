package cn.loong.java;

import java.util.concurrent.CompletableFuture;

/*
    Future获取异步执行结果时, get方法会阻塞主线程
    CompletableFuture(JAVA8) 可以实现传入回调对象, 当结果执行成功之后自动调用回调对象

 */
public class Thread09 {
    public static void main(String[] args) throws Exception {
        CompletableFuture<Integer> cm1 = CompletableFuture.supplyAsync(() -> {
            Test.num += 1;
            return Test.num;
        });

        CompletableFuture<Integer> cm2 = CompletableFuture.supplyAsync(() -> {
            Test.num += 2;
            return Test.num;
        });

        CompletableFuture<Object> cm3 = CompletableFuture.anyOf(cm1, cm2);
        CompletableFuture<Object> cm4 = cm3.thenApplyAsync((result) -> {
            System.out.println(result + "没结束");
            Test.num *= 10;
            return Test.num;
        });

        cm4.thenAccept(System.out::println);

        // 主线程不要立刻结束，否则CompletableFuture默认使用的线程池会立刻关闭:
//        Thread.sleep(2000);
        cm4.join();
    }
}

class Test {
    static int num;
}


