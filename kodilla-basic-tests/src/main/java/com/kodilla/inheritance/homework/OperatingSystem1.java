package com.kodilla.inheritance.homework;

public class OperatingSystem1 extends OperatingSystem {

    @Override
    public void turnOn(){
        System.out.println("Turning on System 1");
    }

    @Override
    public void turnOff(){
        System.out.println("Turning off System 1");
    }

    public OperatingSystem1 (int year){
        super(year);
        System.out.println("Operating System 1  constructor");
    }


}
