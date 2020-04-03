package com.loong.FileTest.FileReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Property01 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        // 从文件流当中读取键值对
        properties.load(new FileReader("C:/Users/lzl36/Desktop/1.js"));

        Set<String> strings = properties.stringPropertyNames();

        for (String key : strings) {
            System.out.println(key + "： " + properties.getProperty(key));
        }
    }
}
