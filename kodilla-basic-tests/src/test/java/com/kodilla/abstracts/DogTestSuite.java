package com.kodilla.abstracts;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class DogTestSuite {

    @Test
    public void testGetNumberOfLegs() {
        // given
        Dog dog = new Dog();
        // when
        int numberOfLegs = dog.getNumberOfLegs();
        // then
        assertEquals(4, numberOfLegs);
    }


}