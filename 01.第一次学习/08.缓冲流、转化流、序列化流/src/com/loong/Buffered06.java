package com.loong;

import java.io.FileReader;
import java.io.IOException;

public class Buffered06 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Users\\lzl36\\Desktop\\2.txt");

        int read;

        while ((read = fr.read()) != -1) {
            System.out.println((char)read);
        }

        fr.close();
    }
}
