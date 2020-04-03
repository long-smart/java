package com.loong.FileTest;

import java.io.File;

public class PrintFiles {
    public static void main(String[] args) {
        File dir = new File("C:/Users/lzl36/Desktop/myself");
        printDir(dir);
    }

    private static void printDir(File dir) {
        File[] files = dir.listFiles();

        for (File file : files) {
            if (file.isFile()) {
                System.out.println("文件名：" + file.getAbsolutePath());
            } else {
                System.out.println("目录名：" + file.getAbsolutePath());
                printDir(file);
            }
        }
    }
}
