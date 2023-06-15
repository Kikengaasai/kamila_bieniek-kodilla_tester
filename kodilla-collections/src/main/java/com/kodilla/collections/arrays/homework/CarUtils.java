package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Honda;
import com.kodilla.collections.interfaces.homework.Opel;

public class CarUtils {

    public static void describeCar(Car car){
        System.out.println("-----------------------------");
        System.out.println("Car kind: " + getCarName(car));
        System.out.println("Car speed: " + car.getSpeed());


    }
    private static String getCarName(Car car) {
        if (car instanceof Honda)
            return "Honda";
        else if (car instanceof Opel)
            return "Opel";
        else if (car instanceof Audi)
            return "Audi";
        else
            return "Unknown car name";
    }


}


