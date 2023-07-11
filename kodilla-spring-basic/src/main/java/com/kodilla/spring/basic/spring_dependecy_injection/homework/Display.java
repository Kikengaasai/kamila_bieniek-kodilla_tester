package com.kodilla.spring.basic.spring_dependecy_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class Display {

    private double displayedValue = 0.0;

    public void display (double value){
        displayedValue = value;
        System.out.println(value);
    }
    public double getDisplayedValue() {
        return displayedValue;
    }

}
