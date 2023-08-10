package com.kodilla.inheritance.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperatingSystem2TestSuite {

    @Test
    public void testConstructor() {
        // given
        int year = 2023;

        // when
        OperatingSystem2 operatingSystem = new OperatingSystem2(year);

        // then
        assertEquals(year, operatingSystem.year);
    }
}

