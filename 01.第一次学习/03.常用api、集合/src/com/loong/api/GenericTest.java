package com.loong.api;

public class GenericTest {
    public static void main(String[] args) {
        MyGenericClass<String> obj = new MyGenericClass<>("字符串");
        String str = obj.getName();
        System.out.println(str);
        GenericTest test = new GenericTest();
        int a = test.func(123);
    }

    <E> E func(E age) {
        if (age instanceof Integer) {
            int num = (int)age + 1000;
            System.out.println(num);
        }
        return age;
    }
}