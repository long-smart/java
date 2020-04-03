package com.loong;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Buffered03 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("C:/Users/lzl36/Desktop/1.txt"))) {
            String line;
            // 读取一行

            System.out.println((char)br.read());
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                System.out.println("---");
            }

        } catch (IOException io) {
            io.printStackTrace();
        }

    }
}
