package com.loong.redPacket;

import java.util.ArrayList;

public class Common implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int count) {
        ArrayList<Integer> list = new ArrayList<>();

        int time = count - 1;
        int money = totalMoney / count;

        for (int i = 0; i < time; i++) {
            list.add(money);
            totalMoney -= money;
        }

        list.add(totalMoney);
        System.out.println("普通红包金额:" + list);

        return list;
    }
}
