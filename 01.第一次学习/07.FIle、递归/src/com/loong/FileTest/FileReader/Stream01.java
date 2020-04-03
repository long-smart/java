package com.loong.FileTest.FileReader;

import java.io.FileReader;
import java.io.IOException;

public class Stream01 {
    private static final String URL = "C:\\Users\\lzl36\\Desktop\\myself\\study\\java\\07.FIle、递归\\src\\com\\loong\\FileTest\\FileReader\\a.txt";

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader(URL);

//        int b;
//
//        while ((b = fr.read()) != -1) {
//            System.out.println((char)b);
//        }
//
//        fr.close();

        // 使用字符数组
        int len;
        char[] chars = new char[4];

        while ((len = fr.read(chars)) != -1) {
            System.out.println(new String(chars, 0, len));
        }
        fr.close();
    }
}
