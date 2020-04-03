package com;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;

public class BigDecimal01 {
    public static void main(String[] args) throws UnsupportedEncodingException {

        /*
            计算浮点数的差
         */
        BigDecimal a = new BigDecimal("1");
        BigDecimal b = new BigDecimal("0.9");
        BigDecimal c = new BigDecimal("0.8");

        BigDecimal result1 = a.subtract(b);
        BigDecimal result2 = b.subtract(c);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result1.equals(result2));
        System.out.println();
        /*
            保留小数
         */
        BigDecimal a1 = new BigDecimal("0.123");

        BigDecimal a2 = a1.setScale(2, BigDecimal.ROUND_CEILING);

        System.out.println(a2);

        byte[] bytes = "123".getBytes(StandardCharsets.UTF_8);

        System.out.println(new String(bytes));
    }
}
