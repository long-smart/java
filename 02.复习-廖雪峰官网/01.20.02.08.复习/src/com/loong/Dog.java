package com.loong;

/**
 *  Java内建的访问权限包括public、protected、private和package权限；
 *
 *  Java在方法内部定义的变量是局部变量，局部变量的作用域从变量声明开始，到一个块结束；
 *
 *  final修饰符不是访问权限，它可以修饰class、field和method；
 *
 *  一个.java文件只能包含一个public类，但可以包含多个非public类。
 *
 */
public class Dog implements Animal {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("狗");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
