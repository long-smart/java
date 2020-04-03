package com.loong.FileTest.FileReader;

import java.io.*;

public class Stream04 {
    public static void main(String[] args) throws IOException {
        FileReader fis = new FileReader("C:/Users/lzl36/Desktop/1.js");
        FileWriter fos = new FileWriter("C:/Users/lzl36/Desktop/2.js");

        try (fis; fos) {
            int c;
            char[] chars = new char[1];
            while ((c = fis.read()) != -1) {
                System.out.println(c);
                fos.write(c);
            }
        } catch (IOException io) {
            io.printStackTrace();
        }
    }
}
