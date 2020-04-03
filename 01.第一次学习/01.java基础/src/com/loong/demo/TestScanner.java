package com.loong.demo;

import java.util.Scanner;

public class TestScanner {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("请输入整数:");
        int num = sca.nextInt();
        System.out.println(num);
    }

}
