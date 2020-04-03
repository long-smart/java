package com.loong.module01;

import java.math.BigInteger;

/*
    java.math.BigInteger用来表示任意大小的整数。BigInteger内部用一个int[]数组来模拟一个非常大的整数；
    和long型整数运算比，BigInteger不会有范围限制，但缺点是速度比较慢；
    BigInteger和Integer、Long一样，也是不可变类，并且也继承自Number类；
    使用longValueExact()方法时，如果超出了long型的范围，会抛出ArithmeticException；
    如果BigInteger的值超过了float的最大范围，返回 Infinity 。

    BigInteger是不变类，并且继承自Number；
    将BigInteger转换成基本类型时可使用longValueExact()等方法保证结果准确。


 */

public class BigInteger01 {
    public static void main(String[] args) {
        BigInteger num1 = new BigInteger("1231123");
        System.out.println(num1.longValue());
        // 乘法
        // 使用longValueExact()方法时，如果超出了long型的范围，会抛出ArithmeticException。
        System.out.println(num1.multiply(new BigInteger("2")).longValueExact());

        // 如果超出float 返回Infinity
        BigInteger n = new BigInteger("999999").pow(99);
        float f = n.floatValue();
        System.out.println(f);
    }
}
