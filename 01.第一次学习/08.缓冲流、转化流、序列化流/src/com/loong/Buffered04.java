package com.loong;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Buffered04 {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:/Users/lzl36/Desktop/1.txt"))) {
            bw.write("1");
            bw.newLine();
            bw.write("2");
            bw.newLine();
            bw.write("3");
        } catch (IOException io) {
            io.printStackTrace();
        }
    }
}
