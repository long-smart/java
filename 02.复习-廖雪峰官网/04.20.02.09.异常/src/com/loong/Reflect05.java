package com.loong;

import java.lang.reflect.Method;

/*
    通过Class实例的方法可以获取Method实例：getMethod()，getMethods()，getDeclaredMethod()，getDeclaredMethods()；
    通过Method实例可以获取方法信息：getName()，getReturnType()，getParameterTypes()，getModifiers()；
    通过Method实例可以调用某个对象的方法：Object invoke(Object instance, Object... parameters)；
    通过设置setAccessible(true)来访问非public方法；
    通过反射调用方法时，仍然遵循多态原则。

    Method getMethod(name, Class...)：获取某个public的Method（包括父类）
    Method getDeclaredMethod(name, Class...)：获取当前类的某个Method（不包括父类）private的method
    Method[] getMethods()：获取所有public的Method（包括父类）
    Method[] getDeclaredMethods()：获取当前类的所有Method（不包括父类）
 */
public class Reflect05 {
    public static void main(String[] args) throws Exception {
        Class personClass = Person.class;
        System.out.println(personClass.getMethod("setName", String.class));
        System.out.println(personClass.getMethod("getName"));

        Person p = new Person("小明", 12);

        Method getName = personClass.getMethod("getName");
        // getName()：返回方法名称，例如："getScore"；
        // getReturnType()：返回方法返回值类型，也是一个Class实例，例如：String.class；
        // getParameterTypes()：返回方法的参数类型，是一个Class数组，例如：{String.class, int.class}；
        // getModifiers()：返回方法的修饰符，它是一个int，不同的bit表示不同的含义。
        System.out.println(getName.getName());
        System.out.println(getName.getReturnType());
        System.out.println(getName.getParameterTypes());
        System.out.println(getName.getModifiers());

        Object val = getName.invoke(p);
        System.out.println(val);

        String s = "hello world";
        Method subString = s.getClass().getMethod("substring", int.class);
        Object val1 = subString.invoke(s, 5);
        System.out.println(val1);

        // 调用静态方法
        Method parseInt = Integer.class.getMethod("parseInt", String.class);
        // 静态方法不需要实例调用， 所以传null
        Object val2 = parseInt.invoke(null, "123");
        System.out.println(val2);

        // 调用非public方法可以用getDeclaredMethod来获取,需要设置setAccessible(true)
        Method say = personClass.getDeclaredMethod("say");
        say.setAccessible(true);
        say.invoke(p);
    }
}
