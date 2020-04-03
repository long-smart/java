package com.loong.thread;

/*
    1.  使用Lambda必须具有接口，且要求**接口中有且仅有一个抽象方法**。
        无论是JDK内置的`Runnable`、`Comparator`接口还是自定义的接口，只有当接口中的抽象方法存在且唯一时，才可以使用Lambda。
    2.  使用Lambda必须具有**上下文推断**。
        也就是方法的参数或局部变量类型必须为Lambda对应的接口类型，才能使用Lambda作为该接口的实例。
 */
public class LambdaTest03 {
    public static void main(String[] args) {
        invokeCalc(10, 20, (int a, int b) -> {
            return a + b;
        });
        // 省略写法
        invokeCalc(30, 40, (int a, int b) -> a + b);
    }

    private static void invokeCalc(int a, int b, Calculator calculator) {
        int result = calculator.calc(a, b);
        System.out.println(result);
    }
}
