package com.loong.learnJava.absoluteFactory;

import java.io.IOException;
import java.nio.file.Path;

public class GoodHTMLDocument implements HTMLDocument {
    @Override
    public void save(Path path) throws IOException {

    }

    @Override
    public String toHtml() {
        return null;
    }
}
