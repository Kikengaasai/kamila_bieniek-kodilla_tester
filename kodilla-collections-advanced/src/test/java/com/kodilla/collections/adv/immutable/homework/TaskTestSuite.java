package com.kodilla.collections.adv.immutable.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTestSuite {

    @Test
    public void testGetTitle() {
        // given
        String expectedTitle = "Do laundry";
        int duration = 60;

        // when
        Task task = new Task(expectedTitle, duration);
        String actualTitle = task.getTitle();

        // then
        assertEquals(expectedTitle, actualTitle);
    }

    @Test
    public void testGetDuration() {
        // given
        String title = "Do laundry";
        int expectedDuration = 60;

        // when
        Task task = new Task(title, expectedDuration);
        int actualDuration = task.getDuration();

        // then
        assertEquals(expectedDuration, actualDuration);
    }

}