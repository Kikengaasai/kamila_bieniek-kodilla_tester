package com.kodilla.collections.adv.exercises.homework;

import java.util.*;
import java.util.stream.Collectors;

public class FlightFinder {

    List<Flight> airport = new ArrayList<>();

    public List<Flight> addFlight (Flight flight){
        airport.add(flight);

        return airport;
    }

    public List<Flight> findFlightsFrom(String departure){
        List<Flight> departures =airport
                .stream()
                .filter(f->f.getDeparture().equals(departure))
                .toList();
        return departures;
    }

    public List<Flight> findFlightsTo(String arrival){
        List<Flight> arrivals =airport
                .stream()
                .filter(f->f.getArrival().equals(arrival))
                .toList();
        return arrivals;


    }



}



