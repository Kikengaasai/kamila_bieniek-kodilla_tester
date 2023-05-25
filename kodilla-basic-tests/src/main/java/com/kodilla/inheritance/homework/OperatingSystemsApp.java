package com.kodilla.inheritance.homework;

public class OperatingSystemsApp {

    public static void main (String[] args){

        OperatingSystem operatingSystem = new OperatingSystem(1992);
        operatingSystem.turnOn();
        operatingSystem.turnOff();

        OperatingSystem1 operatingSystem1 = new OperatingSystem1(2000);
        operatingSystem1.turnOn();
        operatingSystem1.turnOff();

        OperatingSystem2 operatingSystem2 = new OperatingSystem2(2005);
        operatingSystem2.turnOn();
        operatingSystem2.turnOff();
    }
}
