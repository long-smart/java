package com.loong.learJava.ForkJoin;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class Main {
    public static void main(String[] args) {
        long[] array = new long[2000];
        long expectedSum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random();
            expectedSum += array[i];
        }
        System.out.println("Expected sum: " + expectedSum);

        ForkJoinTask<Long> task = new SumTask(array, 0, array.length);
        long start = System.currentTimeMillis();
        Long result = ForkJoinPool.commonPool().invoke(task);
        long end = System.currentTimeMillis();
        System.out.println("Fork/join sum: " + result + " in " + (end - start) + " ms.");
    }
    static Random random = new Random(0);

    static long random() {
        return random.nextInt(10000);
    }

}
