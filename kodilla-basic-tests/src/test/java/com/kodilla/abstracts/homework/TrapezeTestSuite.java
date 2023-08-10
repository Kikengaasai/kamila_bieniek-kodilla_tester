package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrapezeTestSuite {
    @Test
    public void testTrapezeArea() {
        Trapeze trapeze = new Trapeze(2, 4, 6, 5, 8);
        assertEquals(24, trapeze.getArea());
    }

    @Test
    public void testTrapezePerimeter() {
        Trapeze trapeze = new Trapeze(2, 4, 6, 5, 8);
        assertEquals(17, trapeze.getPerimeter());
    }

}