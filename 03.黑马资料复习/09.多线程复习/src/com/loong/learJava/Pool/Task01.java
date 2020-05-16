package com.loong.learJava.Pool;

import java.util.concurrent.Callable;

public class Task01 implements Callable<String> {
    @Override
    public String call() throws Exception {
        int result = 0;
        for (int i = 0; i < 1000; i++) {
            result += i;
        }
        return String.valueOf(result);
    }
}
