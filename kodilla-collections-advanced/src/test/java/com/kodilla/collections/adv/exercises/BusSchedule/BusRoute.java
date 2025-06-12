package com.kodilla.collections.adv.exercises.BusSchedule;

import java.util.Objects;

public class BusRoute {
    private String from;
    private String to;
    private String departureTime;

    public BusRoute(String from, String to, String departureTime) {
        this.from = from;
        this.to = to;
        this.departureTime = departureTime;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BusRoute busRoute = (BusRoute) o;
        return Objects.equals(from, busRoute.from) && Objects.equals(to, busRoute.to) && Objects.equals(departureTime, busRoute.departureTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to, departureTime);
    }
}
