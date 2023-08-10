package com.kodilla.collections.sets.homework;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class StampsApplicationTestSuite {

    @Test
    public void testStampsSize() {
        // given
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Paris", 5, 4, false));
        stamps.add(new Stamp("Paris", 5, 4, false));
        stamps.add(new Stamp("London", 3, 7, true));
        stamps.add(new Stamp("Paris", 5, 4, false));
        stamps.add(new Stamp("Paris", 5, 4, false));

        // then
        assertEquals(2, stamps.size());
    }

}