package com.loong;

import java.io.IOException;
import java.io.PrintStream;

public class PrintStream01 {
    public static void main(String[] args) throws IOException {
        System.out.println(97);
        // 打印流
        PrintStream ps = new PrintStream("C:/Users/lzl36/Desktop/1.txt");
        // 设置打印流
        System.setOut(ps);
        System.out.println(97);
    }
}
