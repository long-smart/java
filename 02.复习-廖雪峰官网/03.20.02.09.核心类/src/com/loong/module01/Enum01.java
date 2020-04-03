package com.loong.module01;

/*
    Java使用enum定义枚举类型，它被编译器编译为final class Xxx extends Enum { … }；

    通过name()获取常量定义的字符串，注意不要使用toString()；

    通过ordinal()返回常量定义的顺序（无实质意义）；

    可以为enum编写构造方法、字段和方法

    enum的构造方法要声明为private，字段强烈建议声明为final；

    enum适合用在switch语句中。
 */
public class Enum01 {
    public static void main(String[] args) {
        weekday w = weekday.SUN;
        System.out.println(w.day);
        System.out.println(w.chinese);
    }

    enum weekday {
        SUN(7, "星期日"),
        MON(1, "星期一"),
        TUE(2, "星期二"),
        WED(3, "星期三"),
        THU(4, "星期四"),
        FRI(5, "星期五"),
        SAT(6, "星期六");

        private final int day;
        private String chinese;

        weekday(int day, String chinese) {
            this.day = day;
            this.chinese = chinese;
        }
    }
}
