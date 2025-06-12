package com.kodilla.collections.adv.exercises.BusSchedule;

import java.util.ArrayList;
import java.util.List;

public class BusRepository {

    public static List<BusRoute> getRoute(){
        List<BusRoute> busRoutes = new ArrayList<>();
        busRoutes.add(new BusRoute("Kraków", "Warszawa", "1:20"));
        busRoutes.add(new BusRoute("Kraków", "Wrocław", "12:20"));
        busRoutes.add(new BusRoute("Kraków", "Gdańsk", "13:10"));
        busRoutes.add(new BusRoute("Kraków", "Rzeszów", "10:02"));
        busRoutes.add(new BusRoute("Katowice", "Warszawa", "1:20"));

        return busRoutes;
    }

}
