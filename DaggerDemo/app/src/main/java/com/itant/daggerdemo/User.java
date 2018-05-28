package com.itant.daggerdemo;

import javax.inject.Inject;

public class User {
    private String name = "I am user name";

    @Inject
    public User() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}