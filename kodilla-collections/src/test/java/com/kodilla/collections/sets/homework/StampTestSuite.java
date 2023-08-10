package com.kodilla.collections.sets.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StampTestSuite {

    @Test
    public void testGetStampName() {
        // given
        Stamp stamp = new Stamp("Stamp 1", 10, 5, true);

        // then
        assertEquals("Stamp 1", stamp.getStampName());
    }
    @Test
    public void testGetLength() {
        // given
        Stamp stamp = new Stamp("Stamp 1", 10, 5, true);

        // then
        assertEquals(10, stamp.getLength());
    }

    @Test
    public void testGetWidth() {
        // given
        Stamp stamp = new Stamp("Stamp 1", 10, 5, true);

        // then
        assertEquals(5, stamp.getWidth());
    }

}