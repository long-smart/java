package com;

import java.util.StringJoiner;

public class String01 {
    public static void main(String[] args) {
        /*
            StringJoiner 用于拼接字符串
            String.join 再不要指定开始和结尾时, 用这个更方便
         */
        String[] strs = {"job", "alice", "grace"};

        StringJoiner sj = new StringJoiner(",", "~~", "!");
        for (String str : strs) {
            sj.add(str);
        }

        System.out.println(sj);

        System.out.println(String.join(",", strs));

        System.out.println(weekday.SUN.day);
    }

}

enum weekday{
    SUN(1), MON(2), TUE(3), WED(4), THU(5), FRI(6), SAT(0);

    public final int day;

    private weekday(int i) {
        this.day = i;
    }
}
