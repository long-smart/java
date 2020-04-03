package com.loong;

import java.io.*;

public class Buffered02 {
    private static final String INPUT = "C:/Users/lzl36/Downloads/ideaIU-2019.2.4.exe";
    private static final String OUTPUT = "C:/Users/lzl36/Desktop/复制.exe";

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(INPUT));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(OUTPUT))) {
            int len;
            byte[] b = new byte[1024 * 1024];
            while ((len = bis.read(b)) != -1) {
                bos.write(b);
            }

        } catch (IOException io) {
            io.printStackTrace();
        }

        long end = System.currentTimeMillis();

        System.out.println("复制完成。耗时：" + (end - start) + "毫秒");
    }
}
