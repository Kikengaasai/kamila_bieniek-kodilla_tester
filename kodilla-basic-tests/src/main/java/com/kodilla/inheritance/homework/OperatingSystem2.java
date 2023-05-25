package com.kodilla.inheritance.homework;

public class OperatingSystem2 extends OperatingSystem {

    @Override
    public void turnOn(){
        System.out.println("Turning on System 2");
    }

    @Override
    public void turnOff(){
        System.out.println("Turning off System 2");
    }

    public OperatingSystem2 (int year){
        super(year);
        System.out.println("Operating System 2  constructor");
    }
}
