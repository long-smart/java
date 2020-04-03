package com.loong.demo;

public class TestStudent {
    public static void main(String[] args) {
        Student xiaoHong = new Student();
        xiaoHong.name = "小红";
        xiaoHong.age = 18;

        Student xiaoMing = new Student();
        xiaoMing.name = "小红";
        xiaoMing.age = 18;

        System.out.println(xiaoHong.name);

    }
}
