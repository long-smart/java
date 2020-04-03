package cn.loong.java;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
    ReentrantLock可以替代synchronized进行同步；
    ReentrantLock获取锁更安全；
    必须先获取到锁，再进入try {...}代码块，最后使用finally保证释放锁；
    可以使用tryLock()尝试获取锁。

    Condition可以替代wait和notify；

    Condition对象必须从Lock对象获取。
 */

public class Thread02 {
    public static void main(String[] args) {

    }
}

class Counter1 {
    // 更安全的锁
    private final Lock lock = new ReentrantLock();
    private int count;

    public void add(int n) {
        lock.lock();

        try {
            count += n;
        }finally {
            lock.unlock();
        }
    }
}
