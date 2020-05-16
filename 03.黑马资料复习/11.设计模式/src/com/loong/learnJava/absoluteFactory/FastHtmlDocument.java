package com.loong.learnJava.absoluteFactory;

import java.io.IOException;
import java.nio.file.Path;

public class FastHtmlDocument implements HTMLDocument {
    public final String md;
    public FastHtmlDocument(String md) {
        this.md = md;
    }

    @Override
    public String toHtml() {
        return "<div>123</div>";
    }

    @Override
    public void save(Path path) throws IOException {
        System.out.println(toHtml());
    }
}
