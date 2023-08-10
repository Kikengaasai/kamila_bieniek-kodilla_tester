package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTestSuite {
    @Test
    public void testTriangleArea() {
        Triangle triangle = new Triangle(3, 4, 5, 0);
        assertEquals(6, triangle.getArea());
    }

    @Test
    public void testTrianglePerimeter() {
        Triangle triangle = new Triangle(3, 4, 5, 3);
        assertEquals(11, triangle.getPerimeter());
    }

}