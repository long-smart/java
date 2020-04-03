package com.loong.module01;

import java.math.BigDecimal;
import java.math.RoundingMode;

/*
    BigDecimal用于表示精确的小数，常用于财务计算；

    比较BigDecimal的值是否相等，必须使用compareTo()而不能使用equals()。
 */
public class BigDecimal01 {
    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("1.12412300");
        System.out.println(num1);
        System.out.println(num1.multiply(num1));
        // scale返回小数位数
        System.out.println(num1.scale());
        //stripTrailingZeros 去除末尾多余的0
        System.out.println(num1.stripTrailingZeros());


        // setScale可以设置精度, 第二个参数可以指定截断还是四舍五入
        BigDecimal d1 = new BigDecimal("123.456789");
        BigDecimal d2 = d1.setScale(4, RoundingMode.HALF_UP); // 四舍五入，123.4568
        BigDecimal d3 = d1.setScale(4, RoundingMode.DOWN); // 直接截断，123.4567
        System.out.println(d2);
        System.out.println(d3);

        System.out.println("---------------");
        // 小数除法要指定保留几位小数, 防止除不尽报错
        BigDecimal d4 = new BigDecimal("123.456");
        BigDecimal d5 = new BigDecimal("23.456789");
        BigDecimal d6 = d4.divide(d5, 10, RoundingMode.HALF_UP); // 保留10位小数并四舍五入
        // BigDecimal d7 = d4.divide(d5); // 报错：ArithmeticException，因为除不尽
        System.out.println(d6);

        System.out.println("----");
        // 做除法的同时，求余数
        BigDecimal n = new BigDecimal("12.345");
        BigDecimal m = new BigDecimal("0.12");
        BigDecimal[] dr = n.divideAndRemainder(m);
        System.out.println(dr[0]); // 102
        System.out.println(dr[1]); // 0.105
        System.out.println("----------");

        // 利用余数判断 n1是m1的整数倍
        // signum 此方法返回-1，0，或1，此BigDecimal的值分类为负，零或正值。
        BigDecimal n1 = new BigDecimal("12.75");
        BigDecimal m1 = new BigDecimal("0.15");
        BigDecimal[] dr1 = n1.divideAndRemainder(m1);
        if (dr1[1].signum() == 0) {
            // n1是m1的整数倍
            System.out.println("n1为m1的整数倍");
        }

        System.out.println("---------");
        // 比较两个bigDecimal不但要求值相等，还要求小数位数相等(scale)
        // 需要使用compareTo 来比较, 他返回负数、正数和0，分别表示小于、大于和等于。
        BigDecimal d8 = new BigDecimal("123.456");
        BigDecimal d9 = new BigDecimal("123.45600");
        System.out.println(d8.equals(d9)); // false,因为scale不同
        System.out.println(d8.equals(d9.stripTrailingZeros())); // true,因为d2去除尾部0后scale变为2
        System.out.println(d8.compareTo(d9)); // 0
    }
}
