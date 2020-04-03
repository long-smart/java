package com.loong;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class charStream01 {
    public static void main(String[] args) throws IOException {
        final String FILE_NAME = "C:/Users/lzl36/Desktop/1.txt";

        InputStreamReader isr = new InputStreamReader(new FileInputStream(FILE_NAME), "GBK");
        InputStreamReader isr2 = new InputStreamReader(new FileInputStream(FILE_NAME), StandardCharsets.UTF_8);


        int read;
        while ((read = isr.read()) != -1) {
            System.out.println((char) read);
        }

        isr.close();

        while ((read = isr2.read()) != -1) {
            System.out.println((char) read);
        }

        isr2.close();
    }
}
