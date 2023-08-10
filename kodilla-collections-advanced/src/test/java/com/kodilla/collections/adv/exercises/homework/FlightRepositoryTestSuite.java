package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightRepositoryTestSuite {

    @Test
    public void testGetFlightsTable() {
        // given
        FlightRepository flightRepository = new FlightRepository();
        // when
        List<Flight> flights = flightRepository.getFlightsTable();
        // then
        assertEquals(6, flights.size());
        assertEquals(new Flight("Paris", "London"), flights.get(0));
        assertEquals(new Flight("Rzym", "Nairobi"), flights.get(1));
        assertEquals(new Flight("Kraków", "Warszawa"), flights.get(2));
        assertEquals(new Flight("Berlin", "Bruksela"), flights.get(3));
        assertEquals(new Flight("Wiedeń", "Tunis"), flights.get(4));
        assertEquals(new Flight("Zabrze", "Dublin"), flights.get(5));
    }

}