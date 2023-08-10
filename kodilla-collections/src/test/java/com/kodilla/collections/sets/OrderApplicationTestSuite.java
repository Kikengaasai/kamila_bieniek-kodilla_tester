package com.kodilla.collections.sets;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class OrderApplicationTestSuite {

    @Test
    public void testOrderApplication() {
        // given
        Set<Order> orders = new HashSet<>();
        orders.add(new Order("1/2023", "Kubek", 1.0));
        orders.add(new Order("2/2023", "Ksiazka", 6.0));
        orders.add(new Order("3/2023", "wibrator", 2.0));
        orders.add(new Order("1/2023", "Kubek", 1.0));

        // when
        int expectedSize = 3;
        int actualSize = orders.size();

        // then
        assertEquals(expectedSize, actualSize); // sprawdza, czy rozmiar zbioru jest taki sam jak oczekiwany
    }

}