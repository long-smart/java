package com.loong.SetMap;

import java.util.ArrayList;
import java.util.List;

public class List01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("第一个元素");
        // 指定位置插入
        list.add(0, "第二个元素");

        // 指定位置删除 或者指定删除内容
        list.remove(1);

        list.set(0, "第三个元素");

        System.out.println(list);
    }
}
