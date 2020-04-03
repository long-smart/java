package com.loong.module01;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

/*
    JavaBean是一种符合命名规范的class，它通过getter和setter来定义属性；

    属性是一种通用的叫法，并非Java语法规定；

    使用Introspector.getBeanInfo()可以获取属性列表。
 */

public class JavaBean02 {
    public static void main(String[] args) throws Exception {
        BeanInfo info = Introspector.getBeanInfo(JavaBean01.class);
        JavaBean01 obj = new JavaBean01("小明", 18);
        for (PropertyDescriptor pd : info.getPropertyDescriptors()) {
            // System.out.println(pd.getName());
            // System.out.println(pd.getReadMethod());
            // System.out.println(pd.getWriteMethod());
            if (pd.getName().equals("name")) {
                System.out.println(pd.getReadMethod().invoke(obj));
                System.out.println(pd.getWriteMethod().invoke(obj, "被反射改过"));
                System.out.println(pd.getReadMethod().invoke(obj));
            }
        }

    }
}
