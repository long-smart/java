package cn.loong.java;

import java.util.concurrent.locks.StampedLock;

/*
    ReadWriteLock 称为悲观锁, 写线程需要等读线程释放后才能获取写锁, 读的过程中不允许写

    StampedLock(JAVA8) 乐观锁, 假设在读的过程中不会有另外的写操作来修改, 可以判断有无写操作, 如果有, 那就在获取一个悲观锁
    相比ReadWriteLock 性能更高, 不需要等待写线程, 而是多加一层判断, 如果又写入, 那在获取悲观锁返回最新的值。否则没有写入,
    那就是最新的值, 直接返回

    StampedLock提供了乐观读锁，可取代ReadWriteLock以进一步提升并发性能；
    StampedLock是不可重入锁。
 */
public class Thread05 {
    public static void main(String[] args) {

    }
}

class Point {
    private final StampedLock stampedLock = new StampedLock();

    private double x;
    private double y;

    public void move(double deltaX, double deltaY) {
        long stamp = stampedLock.writeLock(); // 获取写锁
        try {
            x += deltaX;
            y += deltaY;
        } finally {
            stampedLock.unlockWrite(stamp); // 释放写锁
        }
    }

    public double distanceFromOrigin() {
        long stamp = stampedLock.tryOptimisticRead(); // 获得一个乐观读锁
        // 注意下面两行代码不是原子操作
        // 假设x,y = (100,200)
        double currentX = x;
        // 此处已读取到x=100，但x,y可能被写线程修改为(300,400)
        double currentY = y;
        // 此处已读取到y，如果没有写入，读取是正确的(100,200)
        // 如果有写入，读取是错误的(100,400)
        if (!stampedLock.validate(stamp)) { // 检查乐观读锁后是否有其他写锁发生
            stamp = stampedLock.readLock(); // 获取一个悲观读锁
            try {
                currentX = x;
                currentY = y;
            } finally {
                stampedLock.unlockRead(stamp); // 释放悲观读锁
            }
        }
        return Math.sqrt(currentX * currentX + currentY * currentY);
    }
}
