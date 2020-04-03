package com.loong.api;

public class MyGenericClass<E> {
    private E name;

    public MyGenericClass() {
    }

    public MyGenericClass(E name) {
        this.name = name;
    }

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
