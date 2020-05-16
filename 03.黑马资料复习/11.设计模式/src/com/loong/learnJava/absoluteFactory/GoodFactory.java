package com.loong.learnJava.absoluteFactory;

public class GoodFactory implements AbstractFactory {
    public HTMLDocument createHtml(String md) {
        return new GoodHTMLDocument();
    }
    public WordDocument createWord(String md) {
        return new GoodWordDocument();
    }
}
