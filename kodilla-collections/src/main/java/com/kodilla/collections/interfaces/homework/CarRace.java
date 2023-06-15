package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {

        Car car = new Honda(90);
        doRace(car);

        Car car2 = new Opel(100);
        doRace(car2);

        Car car3 = new Audi(150);
        doRace(car3);

    }

    private static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());
    }
}