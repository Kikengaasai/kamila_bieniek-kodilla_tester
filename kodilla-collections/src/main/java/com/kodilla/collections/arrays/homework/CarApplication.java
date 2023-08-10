package com.kodilla.collections.arrays.homework;


import com.kodilla.collections.arrays.ShapeUtils;
import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Honda;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarApplication {

    public static void main(String[] args) {

        Car[] cars = new Car[15];
        for(int n=0; n< cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    public static Car drawCar() {
        Random random = new Random();
        int drawnCarKind = random.nextInt(3);
        int a = getRandomIncreaseSpeed(random);
        if (drawnCarKind == 0)
            return new Honda(a);
        else if (drawnCarKind == 1)
            return new Opel(a);
        else {
            return new Audi(a);


        }
    }

    public static int getRandomIncreaseSpeed(Random random) {
        return random.nextInt() + 10;
    }
}