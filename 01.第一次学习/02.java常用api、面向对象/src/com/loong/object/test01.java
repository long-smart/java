package com.loong.object;

/**
 *  1 . 抽象类不能创建对象，如果创建，编译无法通过而报错。只能创建其非抽象子类的对象。
 *  理解：假设创建了抽象类的对象，调用抽象的方法，而抽象方法没有具体的方法体，没有意义。
 *  2 . 抽象类中，可以有构造方法，是供子类创建对象时，初始化父类成员使用的。
 *  理解：子类的构造方法中，有默认的super()，需要访问父类构造方法。
 *  3. 抽象类中，不一定包含抽象方法，但是有抽象方法的类必定是抽象类。
 *  理解：未包含抽象方法的抽象类，目的就是不想让调用者创建该类对象，通常用于某些特殊的类结构设
 *  计。
 *  4 . 抽象类的子类，必须重写抽象父类中所有的抽象方法，否则，编译无法通过而报错。除非该子类也是抽象
 *  类。
 *  理解：假设不重写所有抽象方法，则类中可能包含抽象方法。那么创建对象后，调用抽象的方法，没有
 *  意义
 */
public class test01 extends AbstractClass {

    public void eat(String something) {
        System.out.println("在吃" + something);
    }

    public void drink(String something) {
        System.out.println("在喝" + something);
    }
}


class test02 {
    public static void main(String[] args) {
        test01 t = new test01();
        t.eat("桃");
        t.drink("桃汁");
    }
}
