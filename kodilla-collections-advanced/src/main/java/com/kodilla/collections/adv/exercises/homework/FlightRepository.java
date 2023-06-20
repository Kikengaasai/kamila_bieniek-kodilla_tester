package com.kodilla.collections.adv.exercises.homework;

import com.kodilla.collections.adv.exercises.dictionary.EnglishWord;

import java.util.*;

public class FlightRepository {


    public static List<Flight> getFlightsTable() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Paris", "London"));
        flights.add(new Flight("Rzym", "Nairobi"));
        flights.add(new Flight("Kraków", "Warszawa"));
        flights.add(new Flight("Berlin", "Bruksela"));
        flights.add(new Flight("Wiedeń", "Tunis"));
        flights.add(new Flight("Zabrze", "Dublin"));
        return flights;
    }


}

