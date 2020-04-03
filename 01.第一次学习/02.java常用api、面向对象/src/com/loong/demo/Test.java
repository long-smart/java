package com.loong.demo;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Manger manger = new Manger("大王", 100);

        Member member1 = new Member("小红", 20);
        Member member2 = new Member("小李", 0);
        Member member3 = new Member("小王", 10);

        manger.showMoney();
        member1.showMoney();
        member2.showMoney();
        member3.showMoney();

        ArrayList<Integer> list = manger.sendMoney(20, 3);

        System.out.println(list);

        member1.receive(list);
        member2.receive(list);
        member3.receive(list);

        manger.showMoney();
        member1.showMoney();
        member2.showMoney();
        member3.showMoney();
    }
}
