package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {

        Car car = new Honda(90);
        doRace(car);

        private static void doRace(Car car){
            car.increaseSpeed();
            car.increaseSpeed();
            car.increaseSpeed();
            car.decreaseSpeed();
            car.decreaseSpeed();
            System.out.println(car.getSpeed());




        }
    }
}
