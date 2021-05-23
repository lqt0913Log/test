package com.lqt.user.test;

import com.lqt.user.entity.Student3;
import com.lqt.user.entity.Teacher3;

public class CloneTest3 {
    public static void main(String[] args) throws Exception {
        Teacher3 t = new Teacher3();
        t.setName("Teacher Wang");
        t.setAge(50);

        Student3 s1 = new Student3();
        s1.setAge(20);
        s1.setName("ZhangSan");
        s1.setTeacher(t);

        Student3 s2 = (Student3) s1.deepClone();

        System.out.println("拷贝得到的信息:");
        System.out.println(s2.getName());
        System.out.println(s2.getAge());
        System.out.println(s2.getTeacher().getName());
        System.out.println(s2.getTeacher().getAge());
        System.out.println("---------------------------");

        // 将复制后的对象的老师信息修改一下：
        s2.getTeacher().setName("New Teacher Wang");
        s2.getTeacher().setAge(28);

        System.out.println("修改了拷贝对象的教师后：");
        System.out.println("拷贝对象的教师：");
        System.out.println(s2.getTeacher().getName());
        System.out.println(s2.getTeacher().getAge());
        System.out.println("原来对象的教师：");
        System.out.println(s1.getTeacher().getName());
        System.out.println(s1.getTeacher().getAge());

    }
}
