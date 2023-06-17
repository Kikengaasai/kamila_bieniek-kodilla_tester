package com.kodilla.collections.adv.exercises.homework;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    public void testAddFlight(){

        //dajemy rzeczy potrzebne
        FlightFinder flightFinder = new FlightFinder();
        flightFinder.addFlight("SAMOLOT 1", new Flight("Paryż", "Kraków") );
        flightFinder.addFlight("SAMOLOT 2", new Flight("Londyn", "Dublin") );
        flightFinder.addFlight("SAMOLOT 3", new Flight("Rzym", "Berlin") );
        flightFinder.addFlight("SAMOLOT 4", new Flight("Zabrze", "Warszawa") );

        //po dostarczeniu danych uruchamiamy metodę
        List<Flight> result = flightFinder.addFlight("SAMOLOT5", new Flight("Zamość", "Bruksela"));

        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Zamość", "Bruksela"));


        assertEquals(expectedList,result);
    }

    @Test
    public void testFindFlightsFrom(){

        //dane

        FlightFinder flightFinder = new FlightFinder();
        flightFinder.addFlight("SAMOLOT 1", new Flight("Zabrze", "Kraków") );
        flightFinder.addFlight("SAMOLOT 2", new Flight("Londyn", "Dublin") );
        flightFinder.addFlight("SAMOLOT 3", new Flight("Rzym", "Berlin") );
        flightFinder.addFlight("SAMOLOT 4", new Flight("Zabrze", "Warszawa") );

        // wywołujemy odpowiednią metode

        List<Flight> result = flightFinder.findFlightsFrom("Zabrze");

        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Zabrze", "Warszawa");
        expectedList.add(new Flight("Zabrze", "Kraków");

        assertEquals(expectedList, result);



    }

    @Test
    public void testFindFlightsTo(){

        //dane

        FlightFinder flightFinder = new FlightFinder();
        flightFinder.addFlight("SAMOLOT 1", new Flight("Zabrze", "Kraków") );
        flightFinder.addFlight("SAMOLOT 2", new Flight("Londyn", "Dublin") );
        flightFinder.addFlight("SAMOLOT 3", new Flight("Rzym", "Berlin") );
        flightFinder.addFlight("SAMOLOT 4", new Flight("Zabrze", "Warszawa") );

        // wywołujemy odpowiednią metode

        List<Flight> result = flightFinder.findFlightsTo("Kraków");

        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Zabrze", "Kraków"));

        assertEquals(expectedList, result);


    }
