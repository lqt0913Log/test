package com.lqt.user.test;

import com.lqt.user.entity.Student;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CloneTest1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student1 = new Student();
        student1.setName("ZhangSan");
        student1.setAge(20);
        Student student2 = new Student();
        student2 = (Student) student1.clone();
        System.out.println("拷贝得到的信息");
        System.out.println(student2.getName());
        System.out.println(student2.getAge());
        System.out.println("-------------");
        // 修改第二个对象的信息
        student2.setName("LiSi");
        student2.setAge(25);

        System.out.println("修改第二个对象的属性为lisi,25后：");
        System.out.println("第一个对象：");
        System.out.println(student1.getName());
        System.out.println(student1.getAge());
        System.out.println("第二个对象：");
        System.out.println(student2.getName());
        System.out.println(student2.getAge());
        System.out.println("-------------");
    // 说明两个引用student1和student2指向的是不同的对象
        Map<String,Object> map = new Hashtable<>();

        Map<String,Object> map1 = new HashMap<>();
        map1.put("",null);

        Map<String,Object> map2 = new ConcurrentHashMap<>();
    }
}
