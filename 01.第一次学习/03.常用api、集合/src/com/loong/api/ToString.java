package com.loong.api;

import java.util.Objects;

public class ToString {
    public static void main(String[] args) {
        Person person = new Person("小明", 18);
        System.out.println(person);
        boolean b = person.equals(new Person("小明", 18));
        System.out.println(b);
    }
}
