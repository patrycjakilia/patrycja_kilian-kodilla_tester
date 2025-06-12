package com.kodilla.collections.adv.exercises.weather;

import java.util.ArrayList;
import java.util.List;

public class WeatherService {
    public List<CityWeather> getCitiesWithTemperatureAbove(double temp){
        List<CityWeather> result = new ArrayList<>();
        for (CityWeather cityweather : WeatherRepository.getWeatherData()){
            if(cityweather.getTemperatureCelsius() < temp){
                result.add(cityweather);
            }
        }
        return result;
    }
    public CityWeather getCityWeather(String city){
        for (CityWeather cityWeather : WeatherRepository.getWeatherData()){
            if(cityWeather.getCity().equalsIgnoreCase(city)){
                return cityWeather;
            }
        }
        return null;
    }
}
