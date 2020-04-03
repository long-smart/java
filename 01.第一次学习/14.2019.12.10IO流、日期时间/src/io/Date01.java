package io;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class Date01 {
    public static void main(String[] args) {
        // 已经过时
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getYear() + 1900);
        System.out.println(date.getMonth() + 1);
        System.out.println(date.getDate());
        System.out.println(date.toString());
        System.out.println(date.toGMTString());
        System.out.println(date.toLocaleString());

        // 使用SimpleDateFormat对date进行自定义格式化
        String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);

        System.out.println(time);
    }
}
