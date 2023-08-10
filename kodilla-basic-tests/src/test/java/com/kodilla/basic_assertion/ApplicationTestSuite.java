package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTestSuite {
    @Test
    public void testSum() {
        // given
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;

        // when
        int sumResult = calculator.sum(a, b);

        // then
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {
        // given
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;

        // when
        int subtractResult = calculator.subtract(a, b);

        // then
        assertEquals(-3, subtractResult);
    }

    @Test
    public void testSquarePow() {
        // given
        Calculator calculator = new Calculator();
        int a = 5;

        // when
        int squarePowResult = calculator.squarePow(a);

        // then
        assertEquals(25, squarePowResult);
    }

}