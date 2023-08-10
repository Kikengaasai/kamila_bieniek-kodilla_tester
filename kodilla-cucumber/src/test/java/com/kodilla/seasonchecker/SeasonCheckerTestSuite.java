package com.kodilla.seasonchecker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.MonthDay;

import static org.junit.jupiter.api.Assertions.*;

class SeasonCheckerTestSuite {
    @Test
    public void testCheckIfSummer() {
        // Given
        MonthDay date1 = MonthDay.of(6, 25);
        MonthDay date2 = MonthDay.of(9, 15);
        MonthDay date3 = MonthDay.of(12, 1);

        // When
        String result1 = SeasonChecker.checkIfSummer(date1);
        String result2 = SeasonChecker.checkIfSummer(date2);
        String result3 = SeasonChecker.checkIfSummer(date3);

        // Then
        Assertions.assertEquals("Yes! Summer!", result1); // Check if date1 is in summer
        Assertions.assertEquals("Yes! Summer!", result2); // Check if date2 is in summer
        Assertions.assertEquals("Nope", result3); // Check if date3 is in summer
    }

    @Test
    public void testIsDateInSummer() {
        // Given
        MonthDay date1 = MonthDay.of(6, 25);
        MonthDay date2 = MonthDay.of(9, 15);
        MonthDay date3 = MonthDay.of(12, 1);

        // When
        boolean result1 = SeasonChecker.isDateInSummer(date1);
        boolean result2 = SeasonChecker.isDateInSummer(date2);
        boolean result3 = SeasonChecker.isDateInSummer(date3);

        // Then
        Assertions.assertTrue(result1);
        Assertions.assertTrue(result2);
        Assertions.assertFalse(result3);
    }
}