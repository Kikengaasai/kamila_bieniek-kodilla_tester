package com.kodilla.collections.interfaces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTestSuite {

    @Test
    public void testGetArea() {
        // given
        double width = 6;
        double height = 3;
        double hypotenuse = 4;
        Triangle triangle = new Triangle(width, height, hypotenuse);

        // when
        double area = triangle.getArea();

        // then
        assertEquals(12, area);
    }

    @Test
    public void testGetPerimeter() {
        // given
        double width = 5;
        double height = 3;
        double hypotenuse = 4;
        Triangle triangle = new Triangle(width, height, hypotenuse);

        // when
        double perimeter = triangle.getPerimeter();

        // then
        assertEquals(width + height + hypotenuse, perimeter);
    }

}