package com.kodilla.collections.adv.exercises.homework;

import com.kodilla.collections.adv.exercises.dictionary.EnglishWord;
import com.kodilla.collections.adv.exercises.dictionary.PartOfSpeech;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    public void testFindFlightsFrom(){
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> flights = flightFinder.findFlightsFrom("Warsaw");
        assertEquals(1, flights.size());

        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Warsaw", "Milano"));
        assertEquals(flights, expectedList);
    }

    @Test
    public void testFindFilghtsTo(){
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> flights = flightFinder.findFlightsTo("Rome");
        assertEquals(2, flights.size());

        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Cracow", "Rome"));
        expectedList.add(new Flight("Wroclaw", "Rome"));
        assertEquals(flights, expectedList);
    }


}