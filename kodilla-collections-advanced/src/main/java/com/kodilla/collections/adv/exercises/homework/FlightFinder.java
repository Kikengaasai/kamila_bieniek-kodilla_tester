package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

public class FlightFinder {

    Map<String, List<Flight>> airport = new HashMap<>();

    public List<Flight> addFlight (String plane, Flight flight){

        List<Flight> flights = airport.getOrDefault(plane, new ArrayList<>());


        flights.add(flight);

        airport.put(plane, flights);

        return flights;
    }

    public List<Flight> findFlightsFrom(String departure){
        return airport.getOrDefault(departure, Collections.emptyList());

    }

    public List<Flight> findFlightsTo(String arrival){
        return airport.getOrDefault(arrival, Collections.emptyList());

    }



}



