package com.loong;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class CharStream02 {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("C:/Users/lzl36/Desktop/1.txt"), "GBK");

        osw.write("GBK的编码");
        osw.close();

    }
}
