package com.loong;

import java.lang.reflect.Constructor;

/*
Constructor对象封装了构造方法的所有信息；

    通过Class实例的方法可以获取Constructor实例：
        getConstructor()，getConstructors()，getDeclaredConstructor()，getDeclaredConstructors()；
    通过Constructor实例可以创建一个实例对象：
        newInstance(Object... parameters)；
        通过设置setAccessible(true)来访问非public构造方法。
 */
public class Reflect06 {
    public static void main(String[] args) throws Exception {
        // newInstance只能调用public的无参数构造方法
        Person p1 = Person.class.newInstance();
        System.out.println(p1.getAge());


        Constructor con1 = Person.class.getConstructor(String.class, int.class);
        Person p = (Person) con1.newInstance("小明", 12);
        System.out.println(p.getName());
    }
}
