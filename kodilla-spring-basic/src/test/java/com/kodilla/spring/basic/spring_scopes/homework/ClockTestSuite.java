package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ClockTestSuite {
    @Autowired
    private Clock firstClock;

    @Autowired
    private Clock secondClock;

    @Test
    public void shouldReturnDifferentTimes() {
        assertNotEquals(firstClock.getActualTime(), secondClock.getActualTime());
    }

}