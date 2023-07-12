package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarAppTestSuite {

    @Test
    public void shouldTurnOnHeadlightsWhenIsNight() {
        CarApp carApp = new CarApp();
        Car car = carApp.car();
        assertTrue(car.hasHeadlightsTurnedOn());
    }

    @Test
    public void shouldReturnSedanForSpring() {
        CarApp carApp = new CarApp();
        Car car = carApp.car();
        if(car.getMonth()>= 3 && car.getMonth() <= 5){
        assertEquals("Sedan", car.getCarType());}
    }
    @Test
    public void shouldReturnSedanForAutumn() {
        CarApp carApp = new CarApp();
        Car car = carApp.car();
        if (car.getMonth() >= 9 && car.getMonth() <= 11) {
            assertEquals("Sedan", car.getCarType());
        }
    }

    @Test
    public void shouldReturnCabrioForSummer() {
        CarApp carApp = new CarApp();
        Car car = carApp.car();
        if (car.getMonth() >= 6 && car.getMonth() <= 8) {
            assertEquals("Cabrio", car.getCarType());
        }
    }
    @Test
    public void shouldReturnSUVForWinter() {
        CarApp carApp = new CarApp();
        Car car = carApp.car();
        if (car.getMonth() >= 1 && car.getMonth() <= 2 || car.getMonth() == 12) {
            assertEquals("SUV", car.getCarType());
        }
    }

}