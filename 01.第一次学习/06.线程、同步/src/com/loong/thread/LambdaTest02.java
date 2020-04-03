package com.loong.thread;

import java.util.Arrays;
import java.util.Comparator;

class lambdaTest02 {
    public static void main(String[] args) {
        Person1[] arr = {
                new Person1("杨幂", 37),
                new Person1("赵丽颖", 28),
                new Person1("迪丽热巴", 25)
        };

        Comparator<Person1> comp = new Comparator<Person1>() {
            @Override
            public int compare(Person1 o1, Person1 o2) {
                return o1.getAge() - o2.getAge();
            }
        };

        Arrays.sort(arr, comp);

        for (Person1 p : arr) {
            System.out.println(p);
        }
    }
}

class Person1 {
    private String name;
    private int age;

    public Person1() {}

    public Person1(String name, int age) {
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
