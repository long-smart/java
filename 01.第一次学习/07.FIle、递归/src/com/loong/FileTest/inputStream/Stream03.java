package com.loong.FileTest.inputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Stream03 {
    private static final String URL = "C:\\Users\\lzl36\\Desktop\\abc.png";

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(URL);
        FileOutputStream fos = new FileOutputStream("C:\\Users\\lzl36\\Desktop\\123asdasd.png");

        int len;
        byte[] b = new byte[1024];

        while ((len = fis.read(b)) != -1) {
            fos.write(b, 0, len);
        }

        // 流的关闭原则：先开后关，后开先关。
        fos.close();
        fis.close();
    }
}