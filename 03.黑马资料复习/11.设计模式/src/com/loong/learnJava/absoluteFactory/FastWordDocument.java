package com.loong.learnJava.absoluteFactory;

import java.io.IOException;
import java.nio.file.Path;

public class FastWordDocument implements WordDocument {

    public final String md;

    public FastWordDocument(String md) {
        this.md = md;
    }

    @Override
    public void save(Path path) throws IOException {
        System.out.println("FastWord");
    }
}
