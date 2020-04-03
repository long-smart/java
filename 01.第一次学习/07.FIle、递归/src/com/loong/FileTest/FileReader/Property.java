package com.loong.FileTest.FileReader;

import java.util.Properties;
import java.util.Set;

public class Property {
    public static void main(String[] args) {
        // 创建属性集对象
        Properties properties = new Properties();

        // 添加键值对
        properties.setProperty("filename", "1.js");
        properties.setProperty("size", "123123213");
        properties.setProperty("location", "c:/user/");

        System.out.println(properties);

        // 获取一个对应的值
        System.out.println(properties.getProperty("filename"));

        Set<String> strings = properties.stringPropertyNames();

        for (String key : strings) {
            System.out.println(properties.getProperty(key));
        }
    }
}
