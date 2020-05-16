package com.loong.learnJava.absoluteFactory;

import java.io.IOException;
import java.nio.file.Path;

public interface HTMLDocument {
    String toHtml();
    void save(Path path) throws IOException;
}
