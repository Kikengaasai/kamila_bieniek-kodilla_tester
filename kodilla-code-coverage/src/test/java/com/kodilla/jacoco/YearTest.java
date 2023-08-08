package com.kodilla.jacoco;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class YearTest {

    @Test
    public void shouldBeLeapYearIfDivisibleBy400() {// podzielny przez 400

        //given
        Year year = new Year(1600);

        //when
        boolean isLeapYear = year.isLeap();

        //then
        assertTrue(isLeapYear);
    }

    @Test
    public void shouldReturnTrueForLeapYearDivisibleBy4ButNotBy100() {//podzielny przez 4 ale niepodzielny przez 100
        // given
        Year year = new Year(2008);

        // when
        boolean isLeapYear = year.isLeap();

        // then
        assertTrue(isLeapYear);
    }

    @Test
    public void shouldReturnFalseForNonLeapYearNotDivisibleBy4() {//niepodzielny przez 4
        // given
        Year year = new Year(2021);

        // when
        boolean isLeapYear = year.isLeap();

        // then
        assertFalse(isLeapYear);
    }

    @Test
    public void shouldReturnFalseForLeapYearDivisibleBy100ButNotBy400() { // podzielny przez 100 ale niepodzielny przez 400
        // given
        Year year = new Year(1700);

        // when
        boolean isLeapYear = year.isLeap();

        // then
        assertFalse(isLeapYear);
    }


}