package com.kodilla.parametrized_tests.homework;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @ParameterizedTest
    @MethodSource("com.kodilla.parametrized_tests.homework.PersonSources#provideValueForTestingBMI")
    public void getBMI(double heightInMeters, double weightInKilogram, String expectedResult){
        Person p = new Person(heightInMeters, weightInKilogram);
        String result = p.getBMI();

        assertEquals(expectedResult, result);
    }
}