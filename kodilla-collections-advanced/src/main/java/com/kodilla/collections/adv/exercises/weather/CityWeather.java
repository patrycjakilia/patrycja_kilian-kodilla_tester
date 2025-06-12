package com.kodilla.collections.adv.exercises.weather;

import java.util.Objects;

public class CityWeather {
   private String city;
   private double temperatureCelsius;
   private double humidity;

    public CityWeather(String city, double temperatureCelsius, double humidity) {
        this.city = city;
        this.temperatureCelsius = temperatureCelsius;
        this.humidity = humidity;
    }

    public String getCity() {
        return city;
    }

    public double getTemperatureCelsius() {
        return temperatureCelsius;
    }

    public double getHumidity() {
        return humidity;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CityWeather that = (CityWeather) o;
        return Double.compare(temperatureCelsius, that.temperatureCelsius) == 0 && Double.compare(humidity, that.humidity) == 0 && Objects.equals(city, that.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, temperatureCelsius, humidity);
    }
}
