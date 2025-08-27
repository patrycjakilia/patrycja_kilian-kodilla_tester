package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.MonthDay;
import java.time.Month;

@Configuration
public class CarConfiguration {

    public Car carType(){
        Month currentMonth = MonthDay.now().getMonth();
        switch (currentMonth){
            case JUNE:
            case JULY:
            case AUGUST:
                return new Cabrio();
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                return new Sedan();
            default:
                return new SUV();
        }
    }
}
