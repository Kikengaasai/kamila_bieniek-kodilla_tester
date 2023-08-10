package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Honda;
import com.kodilla.collections.interfaces.homework.Opel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarUtilsTestSuite {
    @Test
    public void testGetCarName() {
        // given
        CarUtils utils = new CarUtils();

        // when
        Car honda = new Honda(100);
        Car opel = new Opel(120);
        Car audi = new Audi(150);

        // then
        assertEquals("Honda", utils.getCarName(honda));
        assertEquals("Opel", utils.getCarName(opel));
        assertEquals("Audi", utils.getCarName(audi));
    }

}