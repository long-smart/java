package com.loong.FileTest;

import java.io.File;
import java.io.IOException;

public class FileTest01 {
    private static String path = "C:/Users/lzl36/Desktop";

    public static void main(String[] args) throws IOException {
        File f = new File(path + "/long.txt");
        // 获取文件绝对路径
        System.out.println(f.getAbsolutePath());
        // 文件构造路径
        System.out.println(f.getPath());

        // 文件名称
        System.out.println(f.getName());
        // 文件长度
        System.out.println(f.length());
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());

        File f2 = new File(path + "/aaa.java");

        // 文件目录是否存在
        System.out.println(f2.exists());
        // 此路径是否是文件
        System.out.println(f2.isFile());
        // 此文件是否是目录
        System.out.println(f2.isDirectory());

        // 当此文件不存在时创建新文件 // 返回boolean true 代表创建成功 false: 文件已存在
        System.out.println(f2.createNewFile());

        // 删除此文件对象对应的目录或者文件 // 返回 true: 删除成功 false: 失败 (目录必须为空才能删除)
        System.out.println(f2.delete());


        File f3 = new File(path + "/a/b/c/a.java");

        // 创建目录
        System.out.println(f3.mkdir()); // 返回 true: 成功 false: 失败

        // 创建目录(多级创建)
        System.out.println(f3.mkdirs()); // 返回 true: 成功 false: 失败

        //*****目录遍历******
        File f4 = new File(path);

        // 返回字符串数组，包含当前目录所有文件及目录
        String[] names = f4.list();
        for (String name : names) {
            System.out.println(name);
        }

        // 返回当前目录所有的文件及目录的文件对象
        File[] files = f4.listFiles();
        for (File file : files) {
            System.out.println(file);
        }

    }
}
