package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResultCheckerTestSuite {

    @Test
    public void testAssertEqualsPositive() {
        double expected = 5.0;
        double actual = 5.0;
        assertTrue(ResultChecker.assertEquals(expected, actual));
    }

    @Test
    public void testAssertEqualsNegative() {
        double expected = 5.0;
        double actual = 4.0;
        assertFalse(ResultChecker.assertEquals(expected, actual));
    }
}