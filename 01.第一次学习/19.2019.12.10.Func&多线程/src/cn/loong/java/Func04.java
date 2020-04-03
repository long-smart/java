package cn.loong.java;

import java.util.function.Function;

public class Func04 {
    /*
        java.util.function.Function<T,R> 接口用来根据一个类型的数据得到另一个类型的数据，前者称为前置条件
     */
    public static void main(String[] args) {
        String str = "赵丽颖,20";
        int age = func1(str, s -> s.split(",")[1], Integer::parseInt, a -> a + 100);

        System.out.println(age);
    }

    private static int func1(String str, Function<String, String> one, Function<String, Integer> two,
                             Function<Integer, Integer> three) {
        return one.andThen(two).andThen(three).apply(str);
    }
    
}
