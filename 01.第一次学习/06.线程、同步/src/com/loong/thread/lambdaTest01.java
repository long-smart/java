package com.loong.thread;

import java.lang.reflect.Array;
import java.util.Arrays;

public class lambdaTest01 {
    public static void main(String[] args) {
        Person[] arr = {
                new Person("杨幂", 37),
                new Person("赵丽颖", 28),
                new Person("迪丽热巴", 25)
        };

        Arrays.sort(arr, (Person a, Person b) -> {
            return a.getAge() - b.getAge();
        });

        for (Person p : arr) {
            System.out.println(p);
        }
    }
}

class Person {
    private String name;
    private int age;

    public Person() {}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name: " + name + "\nage: " + age + "\n";
    }
}
