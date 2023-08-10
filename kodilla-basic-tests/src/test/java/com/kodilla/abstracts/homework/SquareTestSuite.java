package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTestSuite {
    @Test
    public void testSquareArea() {
        Square square = new Square(5);
        assertEquals(25, square.getArea());
    }

    @Test
    public void testSquarePerimeter() {
        Square square = new Square(5);
        assertEquals(20, square.getPerimeter());
    }

}