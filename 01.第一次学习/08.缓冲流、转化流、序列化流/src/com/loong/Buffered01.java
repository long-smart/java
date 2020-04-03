package com.loong;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Buffered01 {
    private static final String INPUT = "C:/Users/lzl36/Downloads/ideaIU-2019.2.4.exe";
    private static final String OUTPUT = "C:/Users/lzl36/Desktop/复制.ext";

    public static void main(String[] args) {
        // 记录开始时间戳
        long start = System.currentTimeMillis();


        try (FileInputStream fis = new FileInputStream(INPUT);
             FileOutputStream fos = new FileOutputStream(OUTPUT)) {
            int b;
            byte[] bytes = new byte[1024];
            while ((b = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, b);
            }
        } catch (IOException io) {
            io.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println("普通流时间" + (end - start));
    }

}
