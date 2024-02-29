package com.sparta.springmvc.response;

import lombok.Getter;

@Getter
public class Star {
    private String name;
    private int age;

    public Star(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Star() {}
}
