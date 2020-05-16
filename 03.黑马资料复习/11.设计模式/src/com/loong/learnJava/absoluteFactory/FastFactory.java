package com.loong.learnJava.absoluteFactory;

public class FastFactory implements AbstractFactory {
    public HTMLDocument createHtml(String md) {
        return new FastHtmlDocument(md);
    }
    public WordDocument createWord(String md) {
        return new FastWordDocument(md);
    }
}
