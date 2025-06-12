package com.kodilla.collections.adv.exercises.BusSchedule;

import java.util.ArrayList;
import java.util.List;

public class BusScheduleService {
    public List<BusRoute> findBusesFrom(String city){
        List <BusRoute> busRoutes = new ArrayList<>();
        for (BusRoute busRoute : BusRepository.getRoute()){
            if(busRoute.getFrom().equalsIgnoreCase(city)){
                busRoutes.add(busRoute);
            }
        }
        return busRoutes;
    }
    public List<BusRoute> findBusesTo(String city){
        List <BusRoute> busRoutes = new ArrayList<>();
        for (BusRoute busRoute : BusRepository.getRoute()){
            if(busRoute.getTo().equalsIgnoreCase(city)){
                busRoutes.add(busRoute);
            }
        }
        return busRoutes;
    }
    public List<BusRoute> findBusesBetween(String from, String to){
        List <BusRoute> busRoutes = new ArrayList<>();
        for (BusRoute busRoute : BusRepository.getRoute()){
            if(busRoute.getFrom().equalsIgnoreCase(from) && busRoute.getTo().equalsIgnoreCase(to) ){
                busRoutes.add(busRoute);
            }
        }
        return busRoutes;
    }


}
