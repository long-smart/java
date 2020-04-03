package com.loong;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Serialize02 {
    public static void main(String[] args) {
        Person p1;

        try {
            FileInputStream fis = new FileInputStream("C:/Users/lzl36/Desktop/1.txt");
            ObjectInputStream in = new ObjectInputStream(fis);
            p1 = (Person) in.readObject();
            in.close();
            fis.close();
        } catch (IOException io) {
            io.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("找不到类");
            c.printStackTrace();
            return;
        }

        System.out.println("name:" + p1.getName());
        System.out.println("age: " + p1.getAge());
        System.out.println(p1.eid);
    }
}
