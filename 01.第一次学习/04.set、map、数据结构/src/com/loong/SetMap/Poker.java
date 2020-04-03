package com.loong.SetMap;

import java.util.*;

public class Poker {
    public static void main(String[] args) {
        HashMap<Integer, String> pokerMap = new HashMap<>();

        // 创建花色 与 数字
        ArrayList<String> colors = new ArrayList<>();
        ArrayList<String> numbers = new ArrayList<>();

        Collections.addAll(colors, "♦", "♣", "♥", "♠");
        Collections.addAll(numbers, "2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");

        int count = 1;
        // 加入大王小王
        pokerMap.put(count++, "大王");
        pokerMap.put(count++, "小王");
        // 加入牌
        for (String number : numbers) {
            for (String color : colors) {
                String card = color + number;
                pokerMap.put(count++, card);
            }
        }

        //将牌打乱
        Set<Integer> numberSet = pokerMap.keySet();
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.addAll(numberSet);

        // 打乱
        Collections.shuffle(numberList);

        // 创建三个玩家 和 一个底牌 的list
        ArrayList<Integer> nopa1 = new ArrayList<>();
        ArrayList<Integer> nopa2 = new ArrayList<>();
        ArrayList<Integer> nopa3 = new ArrayList<>();

        ArrayList<Integer> dipai = new ArrayList<>();

        for (int i = 0; i < numberList.size(); i++) {
            Integer no = numberList.get(i);

            if (i >= 51) {
                dipai.add(no);
            } else {
                if (i % 3 == 0) {
                    nopa1.add(no);
                } else if (i % 3 == 1) {
                    nopa2.add(no);
                } else {
                    nopa3.add(no);
                }
            }
        }

        Collections.sort(nopa1);
        Collections.sort(nopa2);
        Collections.sort(nopa3);
        Collections.sort(dipai);

        // 牌面转化
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> di = new ArrayList<>();

        for (Integer i : nopa1) {
            String card = pokerMap.get(i);
            player1.add(card);
        }

        for (Integer i : nopa2) {
            String card = pokerMap.get(i);
            player2.add(card);
        }

        for (Integer i : nopa3) {
            String card = pokerMap.get(i);
            player3.add(card);
        }

        for (Integer i : dipai) {
            String card = pokerMap.get(i);
            di.add(card);
        }

        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(di);
    }
}
