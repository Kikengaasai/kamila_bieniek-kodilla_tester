package com.kodilla.abstracts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTestSuite {

    @Test
    public void testGetNumberOfLegs() {
        // given
        Animal animal = new Animal(4) {
            @Override
            public void giveVoice() {
                System.out.println("Animal voice");
            }
        };
        // when
        int numberOfLegs = animal.getNumberOfLegs();
        // then
        assertEquals(4, numberOfLegs);
    }

    @Test
    public void testGiveVoice() {
        // given
        Animal animal = new Animal(4) {
            @Override
            public void giveVoice() {
                System.out.println("Animal voice");
            }
        };

        animal.giveVoice();

}}