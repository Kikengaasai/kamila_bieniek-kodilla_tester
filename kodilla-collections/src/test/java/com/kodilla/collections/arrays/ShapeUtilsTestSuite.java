package com.kodilla.collections.arrays;

import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Triangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeUtilsTestSuite {

    @Test
    public void testGetShapeName() {
        // given
        ShapeUtils utils = new ShapeUtils();

        // when
        Shape circle = new Circle(5);
        Shape triangle = new Triangle(3, 4, 5);
        Shape square = new Square(4);

        // then
        assertEquals("Circle", utils.getShapeName(circle));
        assertEquals("Triangle", utils.getShapeName(triangle));
        assertEquals("Square", utils.getShapeName(square));
    }

}