package com.kodilla.inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertibleTestSuite {

    @Test
    public void testGetWheels() {
        // given
        int wheels = 4;
        Convertible convertible = new Convertible(wheels, 4);

        // when
        int result = convertible.getWheels();

        // then
        assertEquals(wheels, result);
    }

    @Test
    public void testGetSeats() {
        // given
        int seats = 4;
        Convertible convertible = new Convertible(4, seats);

        // when
        int result = convertible.getSeats();

        // then
        assertEquals(seats, result);
    }

    @Test
    public void testConstructor() {
        // given
        int wheels = 4;
        int seats = 4;

        // when
        Convertible convertible = new Convertible(wheels, seats);

        // then
        assertEquals(wheels, convertible.getWheels());
        assertEquals(seats, convertible.getSeats());
    }

}