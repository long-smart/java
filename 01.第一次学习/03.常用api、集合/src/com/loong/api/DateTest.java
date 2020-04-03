package com.loong.api;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) throws ParseException {
        // 将当前时间对象格式化为字符串
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = format.format(new Date());
        System.out.println(str);

        // 将字符串格式化为时间对象
        DateFormat df = new SimpleDateFormat("yyyy年MM月dd日 HH点mm分ss秒");
        String str1 = "2000年06月06日 23点06分06秒";
        Date date = df.parse(str1);

        System.out.println(date);

    }
}
