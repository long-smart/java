package com.loong;

/**
 *  子类可以覆写父类的方法（Override），覆写在子类中改变了父类方法的行为；
 *  Java的方法调用总是作用于运行期对象的实际类型，这种行为称为多态；
 *
 *  final修饰符有多种作用：
 *      final修饰的方法可以阻止被覆写；
 *      final修饰的class可以阻止被继承；
 *      final修饰的 field 必须在创建对象时初始化，随后不可修改。
 */
public class Main01 {
    public static void main(String[] args) {
        Person p1 = new Student();
        p1.run();
    }
}
