package com.kodilla.collections.adv.exercises.homework;

import java.util.Objects;

public class Flight {
    private String departure;
    private String arrival;

    public Flight(String departure, String arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(departure, flight.departure) && Objects.equals(arrival, flight.arrival);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departure, arrival);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "departure='" + departure + '\'' +
                ", arrival='" + arrival + '\'' +
                '}';
    }
}
