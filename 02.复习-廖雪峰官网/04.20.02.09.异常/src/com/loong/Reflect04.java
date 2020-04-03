package com.loong;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/*
    Java的反射API提供的Field类封装了字段的所有信息：
    通过Class实例的方法可以获取Field实例：getField()，getFields()，getDeclaredField()，getDeclaredFields()；
    通过Field实例可以获取字段信息：getName()，getType()，getModifiers()；
    通过Field实例可以读取或设置某个对象的字段，如果存在访问限制，要首先调用setAccessible(true)来访问非public字段。
    通过反射读写字段是一种非常规方法，它会破坏对象的封装。

    Field getField(name)：根据字段名获取某个public的field（包括父类）
    Field getDeclaredField(name)：根据字段名获取当前类的某个field（不包括父类）
    Field[] getFields()：获取所有public的field（包括父类）
    Field[] getDeclaredFields()：获取当前类的所有field（不包括父类）

 */
public class Reflect04  {
    public static void main(String[] args) throws Exception {
        Class personClass = Person.class;

        System.out.println(personClass.getField("food"));
        System.out.println(personClass.getDeclaredField("name"));
        System.out.println(Arrays.toString(personClass.getFields()));
        System.out.println(Arrays.toString(personClass.getDeclaredFields()));

        Field name = personClass.getDeclaredField("name");
        // getName()：返回字段名称，例如，"name"；
        // getType()：返回字段类型，也是一个Class实例，例如，String.class；
        // getModifiers()：返回字段的修饰符，它是一个int，不同的bit表示不同的含义。
        System.out.println(name);
        System.out.println(name.getName());
        System.out.println(name.getType());
        System.out.println(name.getModifiers());
        System.out.println("------------------------");

        Field f = String.class.getDeclaredField("value");
        System.out.println(f.getName()); // value
        System.out.println(f.getType()); // class [B
        int m = f.getModifiers();
        System.out.println(Modifier.isFinal(m)); // true
        System.out.println(Modifier.isPublic(m)); // false
        System.out.println(Modifier.isProtected(m)); // false
        System.out.println(Modifier.isPrivate(m)); // true
        System.out.println(Modifier.isStatic(m)); // false

        System.out.println("---------------------------------");

        Person p = new Person("小明", 12);
        Class cls1 = p.getClass();
        Field pName = cls1.getDeclaredField("name");
        // 不可以直接获取private的变量
        // 设置允许访问私有字段
        pName.setAccessible(true);
        Object val = pName.get(p);
        System.out.println(val);
        pName.set(p, "反射修改的名字");
        System.out.println(pName.get(p));
    }
}
