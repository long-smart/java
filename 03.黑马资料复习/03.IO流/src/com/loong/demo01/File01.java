package com.loong.demo01;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class File01 {
    private static final String path1 = "C:\\Users\\lzl36\\Desktop\\vue-ts";
    private static final String path2 = path1 + "\\vue.config.js";

    public static void main(String[] args) {
        File file1 = new File(path1);
        File file2 = new File(path2);

//        System.out.println(file1.getAbsoluteFile());
//        System.out.println(file1.getPath());
//        System.out.println(file1.getName());
//        System.out.println(file2.getName());
//
//        System.out.println(file1.exists());
//        System.out.println(file2.exists());
//
//        System.out.println(file1.isDirectory());
//        System.out.println(file2.isFile());
//        System.out.println(file2.delete());
//        try {
//            System.out.println(file2.createNewFile());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        String[] fileNames = file1.list();
        if (fileNames != null) {
            for (String name : fileNames) {
                System.out.println(name);
            }
        }
    }
}
