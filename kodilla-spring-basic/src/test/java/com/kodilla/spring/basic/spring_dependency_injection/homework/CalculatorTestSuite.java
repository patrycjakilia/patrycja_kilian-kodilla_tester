package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CalculatorTestSuite {

    @Test
    public void returnResult(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Display bean = applicationContext.getBean(Display.class);
        String result = bean.display(10);
        Assertions.assertNotNull(result);
    }

    @Test
    public void add(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = applicationContext.getBean(Calculator.class);
        Double result = bean.add(3.2,4.1);
        Assertions.assertEquals(7.3,result);
    }

    @Test
    public void subtract(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = applicationContext.getBean(Calculator.class);
        Double result = bean.subtract(3.2,2.1);
        Assertions.assertEquals(1.1,result);
    }

    @Test
    public void multiply(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = applicationContext.getBean(Calculator.class);
        Double result = bean.multiply(3,4);
        Assertions.assertEquals(12,result);
    }

    @Test
    public void divide(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = applicationContext.getBean(Calculator.class);
        Double result = bean.divide(4.2,2.1);
        Assertions.assertEquals(2,result);
    }
}