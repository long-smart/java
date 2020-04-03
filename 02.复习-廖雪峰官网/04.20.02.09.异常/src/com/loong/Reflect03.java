package com.loong;

/*

 */
public class Reflect03 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        // 获取String的Class实例:
        Class cls = String.class;
        // 创建一个String实例:
        // Class.newInstance()可以创建类实例
        // 它的局限是：只能调用public的无参数构造方法。
        // 带参数的构造方法，或者非public的构造方法都无法通过Class.newInstance()被调用。
        String s = (String) cls.newInstance();
        System.out.println(s);
    }
}
