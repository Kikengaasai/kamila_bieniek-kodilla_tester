package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class SUV implements Car {
    public boolean hasHeadlightsTurnedOn() {
        int hour = LocalTime.now().getHour();  //aktualna godzina
        return hour >= 20 || hour < 6;//zwraca true jeśli godzina jest w zakresie 20-6
    }

    @Override
    public String getCarType() {
        return "SUV";
    }
}