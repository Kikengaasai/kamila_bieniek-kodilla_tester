package com.kodilla.collections.lists.homework;


import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Honda;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Opel opel = new Opel(80);
        cars.add(opel);
        cars.add(new Audi(100));
        cars.add(new Honda(80));
        cars.add(new Opel(90));

        System.out.println(cars.size());
        for (Car car : cars) {
            System.out.println("Describe car: i tu mi czegoś brakuje");
        }

        cars.remove(1);
        cars.remove(opel);

        System.out.println(cars.size());
        for (Car car : cars) {
            System.out.println("Describe car: i tu mi czegoś brakuje");
        }

    }
}
