package com.loong.FileTest.FileReader;

import java.io.FileWriter;
import java.io.IOException;

public class Stream03 {
    public static void main(String[] args) throws IOException {
        FileWriter fr = new FileWriter("C:/Users/lzl36/Desktop/1.js");

        char[] chars = "李智龙".toCharArray();

        fr.write(chars, 0, 1);

        fr.close();
    }
}
