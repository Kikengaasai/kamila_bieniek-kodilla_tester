package com.kodilla.abstracts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuckTestSuite {

    @Test
    public void testGetNumberOfLegs() {
        // given
        Duck duck = new Duck();
        // when
        int numberOfLegs = duck.getNumberOfLegs();
        // then
        assertEquals(2, numberOfLegs);
    }

}