package com.loong.api;

public class list {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        Student s1 = new Student("小明", 12);
        Student s2 = new Student("小红", 15);
        Student s3 = new Student("小李", 18);

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        System.out.println(students[0].getName());

    }
}
