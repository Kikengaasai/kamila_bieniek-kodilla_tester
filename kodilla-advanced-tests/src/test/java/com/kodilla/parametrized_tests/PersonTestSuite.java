package com.kodilla.parametrized_tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTestSuite {

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.PersonSources#getPersonData")
    public void shouldReturnCorrectBMI(double height, double weight, String annotation) {
        Person person = new Person(height, weight);
        String BMI = person.getBMI();
        assertEquals(annotation, BMI);


    }


}

