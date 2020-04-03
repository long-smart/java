package cn.loong.java;

public class Thread01 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        //
        new Thread(() -> counter.add(100)).start();
        new Thread(() -> counter.dec(100)).start();
        // 这里是在线程开启之后读取变量, 这个时候上面两个线程不一定都已经执行完毕了, 所以可能结果不一。
        // 想要读取正确的结果, 需要判断两个线程是否执行完毕, 然后在获取
        System.out.println(counter.getCount());

        Counter counter1 = new Counter();
        new Thread(() -> counter1.add(100)).start();
        new Thread(() -> counter1.dec(100)).start();

        System.out.println(counter1.getCount());


    }
}

class Counter {
    private int count = 0;

    public int getCount() {
        return count;
    }

    public synchronized void add(int n) {
        count += n;
    }

    public synchronized void dec(int n) {
        count -= n;
    }
}
