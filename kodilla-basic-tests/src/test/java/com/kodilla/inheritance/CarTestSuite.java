package com.kodilla.inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTestSuite {

    @Test
    public void testGetWheels() {
        // given
        int wheels = 4;
        Car car = new Car(wheels, 5);

        // when
        int result = car.getWheels();

        // then
        assertEquals(wheels, result);
    }

    @Test
    public void testGetSeats() {
        // given
        int seats = 5;
        Car car = new Car(4, seats);

        // when
        int result = car.getSeats();

        // then
        assertEquals(seats, result);
    }




}