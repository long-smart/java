package com.loong.FileTest.inputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Stream01 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:/Users/lzl36/Desktop/1.js");

        FileInputStream fis = new FileInputStream(file);

        // 读取字节
        int read = fis.read();
        System.out.println(read);
        System.out.println((char) read);

        read = fis.read();
        System.out.println(read);
        System.out.println((char) read);

        read = fis.read();
        System.out.println(read);
        System.out.println((char) read);

        read = fis.read();
        System.out.println(read);
        System.out.println((char) read);

        // 读到末尾返回 -1
        fis.close();

    }
}
