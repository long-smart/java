package com.loong;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;

public class Buffered05 {
    private static final String INPUT = "C:/Users/lzl36/Desktop/1.txt";
    private static final String OUTPUT = "C:/Users/lzl36/Desktop/2.txt";

    public static void main(String[] args) throws IOException {
        HashMap<String, String> lineMap = new HashMap<>();

        // 创建流对象
        BufferedReader br = new BufferedReader(new FileReader(INPUT));
        BufferedWriter bw = new BufferedWriter(new FileWriter(OUTPUT));

        String line;

        while ((line = br.readLine()) != null) {
            String[] split = line.split("\\.");
            System.out.println(Arrays.toString(split));
            lineMap.put(split[0], split[1]);
        }
        br.close();

        for (int i = 1; i < lineMap.size(); i++) {
            // 将 i 转化为字符串
            String key = String.valueOf(i);

            String value = lineMap.get(key);

            bw.write(key + "." + value);
            bw.newLine();
        }
        bw.close();

    }
}
