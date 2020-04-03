package com.loong.FileTest.inputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Stream02 {

    public static void main(String[] args) throws IOException {
        File file = new File("C:/Users/lzl36/Desktop/1.js");
        FileInputStream fis = new FileInputStream(file);

//        int b;
//
//        while ((b = fis.read()) != -1) {
//            System.out.println((char) b);
//        }
//
//        fis.close();

        int len;
        byte[] b = new byte[2];
        while ((len = fis.read(b)) != -1) {
            System.out.println(new String(b, 0, len));
        }

        fis.close();
    }
}
