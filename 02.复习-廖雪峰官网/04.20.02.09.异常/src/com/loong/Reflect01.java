package com.loong;

/*
    JVM为每个加载的class及interface创建了对应的Class实例来保存class及interface的所有信息；
    获取一个class对应的Class实例后，就可以获取该class的所有信息；
    通过Class实例获取class信息的方法称为反射（Reflection）；
    JVM总是动态加载class，可以在运行期根据条件来控制加载class。
 */
public class Reflect01 {
    public static void main(String[] args) throws ClassNotFoundException {
        // 获取一个对象的class
        Class cls1 = String.class;
        Class cls2 = "abc".getClass();
        Class cls3 = Class.forName("java.lang.String");

        System.out.println(cls1 == cls2);
        System.out.println(cls2 == cls3);
    }
}
