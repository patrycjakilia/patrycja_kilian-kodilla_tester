package com.kodilla.collections.adv.exercises.BusSchedule;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BusScheduleServiceTest {

    @Test
    public void findBusesTo(){
        BusScheduleService busScheduleService = new BusScheduleService();
        List<BusRoute> busRoutes = busScheduleService.findBusesTo("Warszawa");

        assertEquals(2, busRoutes.size());
        List<BusRoute> expectedList = new ArrayList<>();
        expectedList.add(new BusRoute("Kraków", "Warszawa", "1:20"));
        expectedList.add(new BusRoute("Katowice", "Warszawa", "1:20"));
        assertEquals(expectedList, busRoutes);
    }

    @Test
    public void findBusesFrom(){
        BusScheduleService busScheduleService = new BusScheduleService();
        List<BusRoute> busRoutes = busScheduleService.findBusesFrom("Kraków");

        assertEquals(4, busRoutes.size());
        List<BusRoute> expectedList = new ArrayList<>();
        expectedList.add(new BusRoute("Kraków", "Warszawa", "1:20"));
        expectedList.add(new BusRoute("Kraków", "Wrocław", "12:20"));
        expectedList.add(new BusRoute("Kraków", "Gdańsk", "13:10"));
        expectedList.add(new BusRoute("Kraków", "Rzeszów", "10:02"));
        assertEquals(expectedList, busRoutes);
    }

    @Test
    public void findBusesBetween(){
        BusScheduleService busScheduleService = new BusScheduleService();
        List<BusRoute> busRoutes = busScheduleService.findBusesBetween("Kraków", "Warszawa");

        assertEquals(1, busRoutes.size());
        List<BusRoute> expectedList = new ArrayList<>();
        expectedList.add(new BusRoute("Kraków", "Warszawa", "1:20"));
        assertEquals(expectedList, busRoutes);

    }

}