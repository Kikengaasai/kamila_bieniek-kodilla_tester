package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {
    int speed;

    public Opel (int speed){
        this.speed=speed;
    }
    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed=speed+30;

    }

    @Override
    public void decreaseSpeed() {
        this.speed=speed-25;

    }
}
