package com.loong.innerClass;

public class Test1 {
    public static void main(String[] args) {
        InnerClass01 in = new InnerClass01() {
            @Override
            public void fly() {
                System.out.println("实现了");
            }
        };

        in.fly();
    }
}
