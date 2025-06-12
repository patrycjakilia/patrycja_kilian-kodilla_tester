package com.kodilla.collections.adv.exercises.weather;

import java.util.ArrayList;
import java.util.List;

public class WeatherRepository {

    public static List<CityWeather> getWeatherData(){
        List<CityWeather> data = new ArrayList<>();
        data.add(new CityWeather("Cracow", 15, 55.0));
        data.add(new CityWeather("Warsaw", 15, 66.2));
        data.add(new CityWeather("Wroclaw", 20, 55.0));
        data.add(new CityWeather("Milano", 28, 50.2));
        data.add(new CityWeather("Rome", 34, 58.2));
        data.add(new CityWeather("Madird", 30, 55.0));

        return data;
    }
}
