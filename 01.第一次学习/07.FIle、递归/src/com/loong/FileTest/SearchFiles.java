package com.loong.FileTest;

import java.io.File;

public class SearchFiles {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\lzl36\\Desktop\\myself\\study\\java\\07.FIle、递归");
        printDir(dir);
    }

    public static void printDir(File dir) {
        File[] files = dir.listFiles();

        for (File file : files) {
            if (file.isFile()) {
                if (file.getName().endsWith(".java")) {
                    System.out.println("文件: " + file.getAbsolutePath());
                }
            } else {
                printDir(file);
            }
        }
    }
}
