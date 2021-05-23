package com.lqt.user.entity;

public class Student  implements Cloneable{
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        // 注意此处要把protected改为public
        return super.clone();
    }
}
