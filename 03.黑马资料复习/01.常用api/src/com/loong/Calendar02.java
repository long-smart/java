package com.loong;

import java.util.Calendar;

public class Calendar02 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2000);
        int year = calendar.get(Calendar.YEAR);
        int mouth = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hours = calendar.get(Calendar.HOUR_OF_DAY);
        int min = calendar.get(Calendar.MINUTE);
        int s = calendar.get(Calendar.SECOND);
        System.out.println(year + "年" + (mouth + 1) + "月" + day + "日" + hours + "时" + min + "分" + s + "秒");
    }
}
