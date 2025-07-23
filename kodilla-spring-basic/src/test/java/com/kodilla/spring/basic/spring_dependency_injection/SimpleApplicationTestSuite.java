package com.kodilla.spring.basic.spring_dependency_injection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class SimpleApplicationTestSuite {

    @Test
    public void shouldReturnCorrectMessage(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        SkypeMessageService bean = applicationContext.getBean(SkypeMessageService.class);
        String message = bean.send("Test", "Any receiver");
        Assertions.assertNotNull(message);
    }

    @Test
    public void shouldProcessMessage(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        SimpleApplication bean = applicationContext.getBean(SimpleApplication.class);
        String message = bean.processMessage("Test", "Any receiver");
        Assertions.assertEquals("Sending [Test] to: Any receiver using Skype", message);
    }
}
