package com.loong.learJava.ReadWriteLockDemo;

import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Counter {
    private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private final Lock rLock = readWriteLock.readLock();
    private final Lock wLock = readWriteLock.writeLock();
    private final int[] counts = new int[10];

    public void inc(int index) {
        wLock.lock();
        try {
            counts[index]++;
        } finally {
            wLock.unlock();
        }
    }

    public int[] get() {
        rLock.lock();
        try {
            return Arrays.copyOf(counts, counts.length);
        } finally {
            rLock.unlock();
        }
    }
}
