package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CarConfigurationTestSUite {

    @Test
    public void carTypeAtLato(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.kodilla.spring");
        CarConfiguration bean = applicationContext.getBean(CarConfiguration.class);
        Car car = bean.carType("lato", LocalTime.of(22, 0));
        Assertions.assertEquals("Cabrio", car);
    }

}