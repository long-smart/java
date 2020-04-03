package com.loong.demo;

public class Method {
    public static void main(String[] args) {
        byte a = 1, b = 2;
        short c = 1, d = 2;
        int e = 1, f = 2;
        compare(a, b);
        compare(c, d);
        compare(e, f);
    }

    public static boolean compare(byte a, byte b) {
        System.out.println("byte");
        return a == b;
    }

    public static boolean compare(short a, short b) {
        System.out.println("short");
        return a == b;
    }

    public static boolean compare(int a, int b) {
        System.out.println("int");
        return a == b;
    }
}
