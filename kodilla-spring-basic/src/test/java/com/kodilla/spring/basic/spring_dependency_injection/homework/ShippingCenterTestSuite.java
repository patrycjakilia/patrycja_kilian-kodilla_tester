package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ShippingCenterTestSuite {

    @Test
    public void successSendPackage(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = applicationContext.getBean(ShippingCenter.class);
        String message = bean.sendPackage("Wadowicka 8a - Kraków", 10);
        Assertions.assertEquals("Package delivered to: Wadowicka 8a - Kraków", message);
    }

    @Test
    public void failedSendPackage(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = applicationContext.getBean(ShippingCenter.class);
        String message = bean.sendPackage("Wadowicka 8a - Kraków", 40);
        Assertions.assertEquals("Package not delivered to: Wadowicka 8a - Kraków", message);
    }

}