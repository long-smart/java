package com.loong;

/*
    通过Class对象可以获取继承关系：

        Class getSuperclass()：获取父类类型；
        Class[] getInterfaces()：获取当前类实现的所有接口。
        通过Class对象的isAssignableFrom()方法可以判断一个向上转型是否可以实现。
 */
public class Reflect07 {
    public static void main(String[] args) {
        Class cls1 = Integer.class;
        Class cls2 = cls1.getSuperclass();
        Class cls3 = cls2.getSuperclass();
        Class cls4 = cls3.getSuperclass();

        System.out.println(cls2);
        System.out.println(cls3);
        System.out.println(cls4);

        Class[] interfaces = cls1.getInterfaces();
        for (Class i : interfaces) {
            System.out.println(i);
        }

        System.out.println("---------------------");
        // Integer i = ?
        Integer.class.isAssignableFrom(Integer.class); // true，因为Integer可以赋值给Integer
        // Number n = ?
        Number.class.isAssignableFrom(Integer.class); // true，因为Integer可以赋值给Number
        // Object o = ?
        Object.class.isAssignableFrom(Integer.class); // true，因为Integer可以赋值给Object
        // Integer i = ?
        Integer.class.isAssignableFrom(Number.class); // false，因为Number不能赋值给Integer
    }
}
