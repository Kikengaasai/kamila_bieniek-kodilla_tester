package com.kodilla.optional.homework;

import java.util.Optional;

public class Teacher {

    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }



    @Override
    public String toString() {
        return name;
    }
}
