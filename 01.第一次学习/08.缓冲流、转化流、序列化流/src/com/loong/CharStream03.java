package com.loong;

import java.io.*;

public class CharStream03 {
    private static final String INPUT = "C:/Users/lzl36/Desktop/1.txt";
    private static final String OUTPUT = "C:/Users/lzl36/Desktop/2.txt";

    public static void main(String[] args) {
        // 转换编码， GBK转为UTF-8
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(INPUT), "GBK");
             OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(OUTPUT))) {

            int len;
            char[] chars = new char[1024];

            while ((len = isr.read(chars)) != -1) {
                osw.write(chars, 0, len);
            }

        } catch (IOException io) {
            io.printStackTrace();
        }
    }
}
