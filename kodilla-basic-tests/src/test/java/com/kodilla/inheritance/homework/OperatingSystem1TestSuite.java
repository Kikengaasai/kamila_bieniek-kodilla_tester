package com.kodilla.inheritance.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperatingSystem1TestSuite {

    @Test
    public void testConstructor() {
        // given
        int year = 2023;

        // when
        OperatingSystem1 operatingSystem = new OperatingSystem1(year);

        // then
        assertEquals(year, operatingSystem.year);
    }

}