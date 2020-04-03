package cn.loong.java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;

/*
    java7 引入了 fork/join新的线程池:把一个大任务拆成多个小任务并行执行。

    Fork/Join是一种基于“分治”的算法：通过分解任务，并行执行，最后合并结果得到最终结果。
    ForkJoinPool线程池可以把一个大任务分拆成小任务并行执行，任务类必须继承自RecursiveTask或RecursiveAction。
    使用Fork/Join模式可以进行并行计算以提高效率。
 */
public class Thread10 {
    private static Random random = new Random();

    public static void main(String[] args) {
        long[] arr = new long[2000];
        long sum = 0;

        for (int i = 0; i < 2000; i++) {
            arr[i] = random.nextInt(100000);
            sum += arr[i];
        }

        System.out.println(sum);

        ForkJoinTask<Long> task = new SumTask(arr, 0, arr.length);
        Long result = ForkJoinPool.commonPool().invoke(task);
        System.out.println(result);
    }
}

class SumTask extends RecursiveTask<Long> {
    static final int THRESHOLD = 500;
    long[] array;
    int start;
    int end;

    public SumTask(long[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        if (end - start <= THRESHOLD) {
            // 任务足够小
            long sum = 0;
            for (int i = start; i < end; i++) {
                sum += this.array[i];
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                }
            }
            return sum;
        }

        // 任务太大
        int middle = (end + start) / 2;
        SumTask subTask1 = new SumTask(this.array, start, middle);
        SumTask subTask2 = new SumTask(this.array, middle, end);

        invokeAll(subTask1, subTask2);

        Long subresult1 = subTask1.join();
        Long subresult2 = subTask2.join();

        long result = subresult1 + subresult2;

        System.out.println(result);

        return result;
    }
}
