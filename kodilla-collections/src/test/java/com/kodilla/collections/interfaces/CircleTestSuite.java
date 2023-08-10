package com.kodilla.collections.interfaces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTestSuite {

    @Test
    public void testGetArea() {
        // given
        double radius = 5;
        Circle circle = new Circle(radius);

        // when
        double area = circle.getArea();

        // then
        assertEquals(Math.PI * radius * radius, area);
    }

    @Test
    public void testGetPerimeter() {
        // given
        double radius = 5;
        Circle circle = new Circle(radius);

        // when
        double perimeter = circle.getPerimeter();

        // then
        assertEquals(2 * Math.PI * radius, perimeter);
    }

}