package com.loong;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialize01 {
    public static void main(String[] args) {
        Person p1 = new Person("李智龙", 18);

        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:/Users/lzl36/Desktop/1.txt"));
            out.writeObject(p1);
            out.close();
            System.out.println("序列化成功");
        } catch (IOException io) {
            io.printStackTrace();
        }
    }
}
