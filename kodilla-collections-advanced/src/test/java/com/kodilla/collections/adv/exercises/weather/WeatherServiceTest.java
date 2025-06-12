package com.kodilla.collections.adv.exercises.weather;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.*;

class WeatherServiceTest {

    @Test
    public void getCitiesWithTemperatureAbove(){
        double temp = 20;
        WeatherService weatherService = new WeatherService();
        List <CityWeather> weatherRepositories = weatherService.getCitiesWithTemperatureAbove(temp);

        assertEquals(2, weatherRepositories.size());
        List<CityWeather> expectedList = new ArrayList<>();
        expectedList.add(new CityWeather("Cracow", 15, 55.0));
        expectedList.add(new CityWeather("Warsaw", 15, 66.2));
        assertEquals(expectedList,weatherRepositories);
    }

    @Test
    public void getCityWeather(){
        String city = "Warsaw";
        WeatherService weatherService = new WeatherService();
        CityWeather cityWeatherResult= weatherService.getCityWeather("Warsaw");
        CityWeather cityWeatherExpected = new CityWeather("Warsaw", 15, 66.2);

        assertEquals(cityWeatherExpected, cityWeatherResult);

    }

}