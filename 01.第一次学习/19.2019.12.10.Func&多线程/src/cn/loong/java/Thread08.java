package cn.loong.java;

import java.util.concurrent.*;

/*
    Callable可以实现有返回值的多线程

    一个Future<V>接口表示一个未来可能会返回的结果，它定义的方法有：
        get()：获取结果（可能会等待）
        get(long timeout, TimeUnit unit)：获取结果，但只等待指定的时间；
        cancel(boolean mayInterruptIfRunning)：取消当前任务；
        isDone()：判断任务是否已完成。
    总结：
        对线程池提交一个Callable任务，可以获得一个Future对象；
        可以用Future在将来某个时刻获取结果。
 */
public class Thread08 {
    public static void main(String[] args) throws Exception {
        ExecutorService es = Executors.newFixedThreadPool(4);// 定义任务

        Callable<String> task = new Task01();
        for (int i = 0; i < 10; i++) {
            // 提交任务并获得Future:
            Future<String> future = es.submit(task);
            // 得到结果可能会阻塞
            System.out.println(future.isDone());
            String result = future.get();
            System.out.println(result);
        }
    }
}

class Task01 implements Callable<String> {
    private int num;

    @Override
    public String call() throws Exception {
        return String.valueOf(++num);
    }
}
