package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CarAppTestSuite {

    @Autowired
    private Car car;

    @Test
    public void shouldTurnOnHeadlightsWhenIsNight() {
        assertTrue(car.hasHeadlightsTurnedOn());
    }

    @Test
    public void shouldReturnSedanForSpring() {
        if(car.getMonth()>= 3 && car.getMonth() <= 5){
        assertEquals("Sedan", car.getCarType());}
    }
    @Test
    public void shouldReturnSedanForAutumn() {
        if (car.getMonth() >= 9 && car.getMonth() <= 11) {
            assertEquals("Sedan", car.getCarType());
        }
    }

    @Test
    public void shouldReturnCabrioForSummer() {
        if (car.getMonth() >= 6 && car.getMonth() <= 8) {
            assertEquals("Cabrio", car.getCarType());
        }
    }
    @Test
    public void shouldReturnSUVForWinter() {
        if (car.getMonth() >= 1 && car.getMonth() <= 2 || car.getMonth() == 12) {
            assertEquals("SUV", car.getCarType());
        }
    }

}