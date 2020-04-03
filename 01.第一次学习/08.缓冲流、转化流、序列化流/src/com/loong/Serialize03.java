package com.loong;

import java.io.*;
import java.util.ArrayList;

public class Serialize03 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person p1 = new Person("a1", 1);
        Person p2 = new Person("a2", 2);
        Person p3 = new Person("a3", 3);

        ArrayList<Person> arrayList = new ArrayList<>();
        arrayList.add(p1);
        arrayList.add(p2);
        arrayList.add(p3);

        // 序列化
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:/Users/lzl36/Desktop/1.txt"));
        out.writeObject(arrayList);
        out.close();

        // 反序列化
        ObjectInputStream oit = new ObjectInputStream(new FileInputStream("C:/Users/lzl36/Desktop/1.txt"));

        ArrayList<Person> list = (ArrayList<Person>) oit.readObject();
        oit.close();

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName());
        }
    }
}
