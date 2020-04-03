import java.util.*;

public class Queue01 {
    public static void main(String[] args) {
        /*
            LinkedList 即实现了list接口, 也实现了 Queue接口。
            在使用时给类型 Queue就代表使用Queue, 给list就代表使用list
            这也体现了Java抽象编程

            队列Queue实现了一个先进先出（FIFO）的数据结构：

            通过add()/offer()方法将元素添加到队尾；
            通过remove()/poll()从队首获取元素并删除；
            通过element()/peek()从队首获取元素但不删除。
            要避免把null添加到队列。
         */
        Queue<String> q = new LinkedList<>();
        // 添加元素
        q.offer("1");
        q.offer("2");
        q.offer("3");

        System.out.println(q.poll()); // 获取队首元素, 删除
        System.out.println(q.poll());
        System.out.println(q.peek()); // 获取队首元素, 不删除
        System.out.println(q.peek());
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.poll());

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        list.forEach(System.out::println);
        // .forEach(System.out::println);
        System.out.println(Arrays.toString(list.stream().map(item -> item + "map").toArray()));
    }
}
