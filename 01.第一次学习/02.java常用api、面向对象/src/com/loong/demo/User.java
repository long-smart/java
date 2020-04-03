package com.loong.demo;

public class User {
    private String name;
    private int money;

    public User() {}

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void showMoney() {
        System.out.println(this.name + '有' + this.money + '元');
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
