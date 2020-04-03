package com.loong.FileTest;

import java.io.File;

public class FileFilter {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\lzl36\\Desktop\\myself\\study\\java\\07.FIle、递归");

        printDir2(dir);
    }

    public static void printDir(File dir) {
        File[] files = dir.listFiles(new java.io.FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".java") || pathname.isDirectory();
            }
        });

        for (File file : files) {
            if (file.isFile()) {
                System.out.println("文件名：" + file.getAbsolutePath());
            } else {
                printDir(file);
            }
        }
    }

    public static void printDir2(File dir) {
        File[] files = dir.listFiles(pathname -> pathname.getName().endsWith(".java") || pathname.isDirectory());

        for (File file : files) {
            if (file.isFile()) {
                System.out.println("文件名：" + file.getAbsolutePath());
            } else {
                printDir(file);
            }
        }
    }
}
