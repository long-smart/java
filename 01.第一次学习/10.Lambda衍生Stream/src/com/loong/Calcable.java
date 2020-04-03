package com.loong;

@FunctionalInterface // 标识这个接口是函数式接口(只有一个抽象方法的接口)
public interface Calcable {
    int calc(int num);
}

