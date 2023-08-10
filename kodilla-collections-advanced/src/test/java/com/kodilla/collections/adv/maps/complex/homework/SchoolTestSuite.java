package com.kodilla.collections.adv.maps.complex.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTestSuite {
    @Test
    public void testCountStudents() {
        // Given
        List<Integer> numberOfStudents = Arrays.asList(10, 20, 30);
        School school = new School(numberOfStudents);

        // When
        int result = school.countStudents();

        // Then
        Assertions.assertEquals(60, result);
    }

}