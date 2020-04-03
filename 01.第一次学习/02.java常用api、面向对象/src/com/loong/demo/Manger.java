package com.loong.demo;

import java.util.ArrayList;

public class Manger extends User {

    public Manger() {
    }

    public Manger(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> sendMoney(int total, int count) {
        ArrayList<Integer> redList = new ArrayList<>();

        int leftMoney = super.getMoney();
        if (total > leftMoney) {
            System.out.println("钱不够。");
            return redList;
        }

        // 扣掉自己的钱
        super.setMoney(leftMoney - total);

        int avg = total / count;
        int mod = total % count;

        for (int i = 0; i < count; i++) {
            redList.add(avg);
        }

        // 把最后一份加入
        redList.add(mod);

        return redList;
    }
}
