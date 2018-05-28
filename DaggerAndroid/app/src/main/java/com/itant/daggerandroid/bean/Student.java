package com.itant.daggerandroid.bean;

import javax.inject.Inject;

public class Student {
    private String name;

    @Inject
    public Student() {
        System.out.println("Student被初始化");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}