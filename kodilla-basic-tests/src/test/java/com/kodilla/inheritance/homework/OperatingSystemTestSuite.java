package com.kodilla.inheritance.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperatingSystemTestSuite {

    @Test
    public void testConstructor() {
        // given
        int year = 2023;

        // when
        OperatingSystem operatingSystem = new OperatingSystem(year);

        // then
        assertEquals(year, operatingSystem.year);
    }

}