package com.loong.demo;

public class Private {
    /**
     * 1. private是一个权限修饰符，代表最小权限。
     * 2. 可以修饰成员变量和成员方法。
     * 3. 被private修饰后的成员变量和成员方法，只在本类中才能访问
     */
    private String name;
    private int age;

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

    // 构造方法
    public Private(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 构造方法重载
    public Private() {}
}
