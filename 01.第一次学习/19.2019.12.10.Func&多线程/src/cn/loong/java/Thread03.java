package cn.loong.java;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
    Condition提供的await()、signal()、signalAll()原理和synchronized锁对象的wait()、notify()、notifyAll()是一致的
    并且其行为也是一样的：

        await()会释放当前锁，进入等待状态；
        signal()会唤醒某个等待线程；
        signalAll()会唤醒所有等待线程；
        唤醒线程从await()返回后需要重新获得锁。

        Condition可以替代wait和notify；

        Condition对象必须从Lock对象获取。

    java.util.concurrent (提供了线程安全的集合)
        List	ArrayList	                CopyOnWriteArrayList
        Map	    HashMap	                    ConcurrentHashMap
        Set	    HashSet / TreeSet	        CopyOnWriteArraySet
        Queue	ArrayDeque / LinkedList	     ArrayBlockingQueue/ LinkedBlockingQueue
        Deque	ArrayDeque / LinkedList	    LinkedBlockingDeque
 */

public class Thread03 {
    public static void main(String[] args) {
        TaskQueue task = new TaskQueue();

        new Thread(() -> {
            task.add("1");
        }).start();

        new Thread(() -> {
            String t = task.getTask();
            System.out.println(t);
        }).start();
    }

}

class TaskQueue {
    private final Lock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();
    private Queue<String> queue = new LinkedList<>();

    public void add(String str) {
        lock.lock();
        try {
            queue.add(str);
            condition.signalAll();
        }finally {
            lock.unlock();
        }
    }

    public String getTask() {
        lock.lock();
        try {
            while (queue.isEmpty()) {
                condition.await();
            }
            return queue.remove();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        return null;
    }
}
