package com.kodilla.inheritance.homework;

public class OperatingSystem {
    int year;

    public void turnOn(){
        System.out.println("Turning on...");
    }

    public void turnOff(){
        System.out.println("Turning off...");
    }

    public OperatingSystem(int year){
        this.year = year;
    }
}
