package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepositor {

    public static List<Flight> getFlightsTable(){
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Warsaw", "Milano"));
        flights.add(new Flight("Milano", "Warsaw"));
        flights.add(new Flight("Cracow", "Rome"));
        flights.add(new Flight("Wroclaw", "Rome"));
        flights.add(new Flight("Oslo", "Cracow"));
        flights.add(new Flight("Stokholm", "Helsinki"));
        return flights;
    }
}