package com.loong.FileTest.outputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Stream01 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\lzl36\\Desktop\\myself\\study\\java\\07.FIle、递归\\src\\com\\loong\\FileTest\\app.ts");
        FileOutputStream fos = new FileOutputStream(file);

        // 写入int， 最终会转为byte
//        fos.write(97);
//        fos.write(98);
//        fos.write(99);


        // 写入字符数组

//        byte[] b = ("function arr<T>(a: T): T {" +
//                "   return a" +
//                "}").getBytes();
//
//        fos.write(b);


        // 从指定长度写入
        byte[] b = "abcdef".getBytes();
        fos.write(b, 2, 2);

        fos.close();
        System.out.println(fos);
    }
}
