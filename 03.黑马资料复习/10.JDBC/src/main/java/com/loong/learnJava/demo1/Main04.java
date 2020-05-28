package com.loong.learnJava.demo1;

public class Main04 {
    public static void main(String[] args) {
        Parent parent = new Parent(){
            {
                add("123");
            }
        };
        System.out.println(parent.list);
    }
}
