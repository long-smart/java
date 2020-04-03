package com.loong;

public class Thread03 {
    public static void main(String[] args) {

        /*
            守护线程:
                Thread t = new MyThread();
                t.setDaemon(true); // 设置为守护线程
                t.start();

            守护线程是为其他线程服务的线程；
            所有非守护线程都执行完毕后，虚拟机退出；
            守护线程不能持有需要关闭的资源（如打开文件等）。

         */
    }
}

class MyThread1 extends Thread {
    /*
        volatile关键字的目的是告诉虚拟机：
            每次访问变量时，总是获取主内存的最新值；
            每次修改变量后，立刻回写到主内存。

        作用是 其他线程使用此变量时，可以保证当前值是最新的。
        解决了共享变量在线程间的可见性问题
     */
    public volatile boolean running = true;

    @Override
    public void run() {
        super.run();
    }
}
