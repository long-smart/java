package com.loong.api;

public class Static {
    /**
     * static: 类属性修饰符.
     */
    // 静态变量 和 静态方法
    static int age;

    // 静态方法不能使用this访问实例属性， 只能访问类属性
    static void showAge() {
        System.out.println(age);
    }

    // 静态代码块，随着类的加载而执行且执行一次，优先于 main方法和构造方法的执行。
    // 可以给变量初始化
    static {
        System.out.println("静态代码块");
        age = 123;
    }
}
