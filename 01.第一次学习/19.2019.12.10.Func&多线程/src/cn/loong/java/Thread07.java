package cn.loong.java;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
    线程池
        FixedThreadPool：线程数固定的线程池；
        CachedThreadPool：线程数根据任务动态调整的线程池；
        SingleThreadExecutor：仅单线程执行的线程池。

        JDK提供了ExecutorService实现了线程池功能：
            线程池内部维护一组线程，可以高效执行大量小任务；
            Executors提供了静态方法创建不同类型的ExecutorService；
            必须调用shutdown()关闭ExecutorService；
            ScheduledThreadPool可以定期调度多个任务。
 */
public class Thread07 {
    // 创建一个固定大小的线程池
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 6; i++) {
            es.submit(new Task(String.valueOf(i)));
        }
        // 关闭线程池:
        es.shutdown(); // 等待所有线程执行完毕, 关闭线程池
//        es.shutdownNow(); // 立即关闭线程次
    }
}


class Task implements Runnable {
    private final String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("start task " + name);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end task" + name);
    }
}