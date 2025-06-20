package com.kodilla.exception;

import java.util.HashMap;
import java.util.Map;

public class AirportRepository {
    private Map<String,Boolean> getListOfAirports(){
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Maiami", true);
        airports.put("Milano", true);
        airports.put("Warsaw", false);
        airports.put("LasPalmas", true);

        return airports;
    }

    public boolean isAirportInUse(String airport) throws AirportNotFoundException {
        if(getListOfAirports().containsKey(airport))
            return getListOfAirports().get(airport);
        throw new AirportNotFoundException();
    }
}
