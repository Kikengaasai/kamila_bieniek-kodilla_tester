package com.kodilla.collections.interfaces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTestSuite {

    @Test
    public void testGetArea() {
        // given
        double width = 5;
        Square square = new Square(width);

        // when
        double area = square.getArea();

        // then
        assertEquals(width * width, area);
    }

    @Test
    public void testGetPerimeter() {
        // given
        double width = 5;
        Square square = new Square(width);

        // when
        double perimeter = square.getPerimeter();

        // then
        assertEquals(4 * width, perimeter);
    }

}