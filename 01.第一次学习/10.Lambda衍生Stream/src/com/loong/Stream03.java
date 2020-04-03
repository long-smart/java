package com.loong;

public class Stream03 {
    public static void main(String[] args) {
        printName("李智龙", 20, (name, age) -> new Person(name, age));
        printName("李智龙", 20, Person::new); // 和 lambda表达式效果一样
    }

    public static void printName(String name, int age, PersonBuilder personBuilder) {
        System.out.println(personBuilder.buildPerson(name, age).getName());
    }
}
