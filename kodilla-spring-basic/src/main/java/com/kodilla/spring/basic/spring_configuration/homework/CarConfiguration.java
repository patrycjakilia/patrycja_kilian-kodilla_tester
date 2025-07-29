package com.kodilla.spring.basic.spring_configuration.homework;

import com.kodilla.spring.basic.spring_configuration.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.time.LocalTime;

@Configuration
public class CarConfiguration {


    @Bean
    public Car carType(String season, LocalTime time){
        if(season.equals("lato")){
            return new Cabrio();
        }else if(season.equals("zima")){
            return new Sedan();
        }else {
            return new SUV();
        }
    }
}
