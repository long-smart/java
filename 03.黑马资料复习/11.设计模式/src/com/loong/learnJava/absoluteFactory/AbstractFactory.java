package com.loong.learnJava.absoluteFactory;

public interface AbstractFactory {
    HTMLDocument createHtml(String md);

    WordDocument createWord(String md);

    static AbstractFactory createFactory(String name) {
        if (name.equalsIgnoreCase("fast")) {
            return new FastFactory();
        } else if (name.equalsIgnoreCase("good")) {
            return new GoodFactory();
        } else {
            throw new IllegalArgumentException("Invalid factory name");
        }
    }
}
