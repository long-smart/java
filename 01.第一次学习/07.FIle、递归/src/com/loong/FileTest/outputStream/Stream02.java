package com.loong.FileTest.outputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Stream02 {
    public static void main(String[] args) throws IOException {
        // 追加写入
        FileOutputStream fos = new FileOutputStream("C:\\Users\\lzl36\\Desktop\\myself\\study\\java\\07.FIle、递归\\src\\com\\loong\\FileTest\\app.ts", true);

        fos.write("abcdef".getBytes());
        fos.write("\r\n".getBytes());
        fos.write("新的一行".getBytes());

        fos.close();
    }
}
