package com.kodilla.collections.adv.maps.complex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GradesTestSuite {
    @Test
    public void testGetAverage() {
        // Arrange
        List<Double> grades = new ArrayList<>();
        grades.add(85.0);
        grades.add(90.5);
        grades.add(78.3);
        Grades gradeBook = new Grades(grades);

        // Act
        double average = gradeBook.getAverage();

        // Assert
        Assertions.assertEquals(84.6, average, 0.01);
    }


}