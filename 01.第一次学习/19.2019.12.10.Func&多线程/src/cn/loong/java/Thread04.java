package cn.loong.java;

import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/*
    使用ReadWriteLock可以提高读取效率：
    ReadWriteLock只允许一个线程写入；
    ReadWriteLock允许多个线程在没有写入时同时读取；
    ReadWriteLock适合读多写少的场景。
    ReadWriteLock 可以解决多个线程可以同时读, 但是只有一个可以写
 */

public class Thread04 {
    public static void main(String[] args) {
        TestCounter counter = new TestCounter();

        new Thread(() -> {
            counter.inc(0);
        }).start();

        new Thread(() -> {
            int[] arr = counter.get();
            System.out.println(Arrays.toString(arr));
        }).start();

    }
}

//@SuppressWarnings("all")
class TestCounter {
    private final ReadWriteLock rwlock = new ReentrantReadWriteLock();
    private final Lock rlock = rwlock.readLock();
    private final Lock wlock = rwlock.writeLock();
    private int[] counts = new int[10];

    public void inc(int index) {
        wlock.lock(); // 加写锁
        try {
            counts[index] += 1;
        } finally {
            wlock.unlock(); // 释放写锁
        }
    }

    public int[] get() {
        rlock.lock(); // 加读锁
        try {
            return Arrays.copyOf(counts, counts.length);
        } finally {
            rlock.unlock(); // 释放读锁
        }
    }
}