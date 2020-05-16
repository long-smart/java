package com.loong.learJava.ReadWriteLockDemo;

import java.util.concurrent.locks.StampedLock;

public class Point {
    private double x;
    private double y;
    private final StampedLock stampedLock = new StampedLock();

    public void move(double x1, double y1) {
        long stamp = stampedLock.writeLock(); // 获取写锁，并返回版本号
        try {
            x = x1;
            y = y1;
        } finally {
            stampedLock.unlockWrite(stamp); // 释放写锁
        }
    }

    public double distanceFromOrigin() {
        long stamp = stampedLock.tryOptimisticRead(); // 获取一个乐观读锁, 可以理解为： 乐观的认为此时没有写操作。
        double currentX = x;
        double currentY = y;

        // 校验再此期间有无写操作, 没有就直接下一步, 有的话重新读取一下写入后的值
        if (!stampedLock.validate(stamp)) {
            stamp = stampedLock.readLock();
            try {
                currentX = x;
                currentY = y;
            } finally {
                stampedLock.unlockRead(stamp);
            }
        }
        return Math.sqrt(currentX * currentX + currentY * currentY);
    }
}
