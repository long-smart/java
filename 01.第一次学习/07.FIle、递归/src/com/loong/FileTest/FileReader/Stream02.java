package com.loong.FileTest.FileReader;

import java.io.FileWriter;
import java.io.IOException;

public class Stream02 {

    private static final String URL = "C:/Users/lzl36/Desktop/1.js";

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter(URL);

        fw.write("1");

        fw.flush();

        fw.write("2\n");
        fw.flush();

        fw.write("关闭");

        fw.close();
    }

}
