package com.loong.api;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    public static void main(String[] args) {
//        Calendar cal = Calendar.getInstance();
//        int year = cal.get(Calendar.YEAR);
//        int month = cal.get(Calendar.MONTH);
//        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
//
//
//        System.out.println(year + "年" + month + "月" + dayOfMonth + "日");
//
//        Calendar cal1 = Calendar.getInstance();
//        cal1.set(Calendar.YEAR, 2020);
//        cal1.set(Calendar.MONTH, 6);
//        cal1.set(Calendar.DAY_OF_MONTH, 32);
//
//        System.out.println(cal1.get(Calendar.YEAR) + "年" + cal1.get(Calendar.MONTH) + "月" + cal1.get(Calendar.DAY_OF_MONTH) + "日");

        Calendar cal = Calendar.getInstance();
        // Calendar.MONTH是从0开始的
        // Calendar 的getTime方法用于 获取时间对象, 可以在调用Date的getTime获取毫秒数
        Date date = cal.getTime();
        System.out.println(date.getTime());
        System.out.println(cal.get(Calendar.YEAR) + "年" + cal.get(Calendar.MONTH) + "月" + cal.get(Calendar.DAY_OF_MONTH) + "日");
    }
}
