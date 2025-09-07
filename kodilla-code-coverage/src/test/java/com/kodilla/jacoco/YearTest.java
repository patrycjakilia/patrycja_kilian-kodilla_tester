package com.kodilla.jacoco;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class YearTest {

    @Test
    public void shouldBeLeapYearIfDivisibleBy400() {
        Year year = new Year(1600);
        boolean isLeapYear = year.isLeap();
        assertTrue(isLeapYear);
    }

    @Test
    public void divisibleBy100Not400_shouldNotBeLeap() {
        Year year = new Year(1900);
        boolean isLeapYear = year.isLeap();
        assertFalse(isLeapYear);
    }

    @Test
    public void divisibleBy4Not100_shouldBeLeap() {
        Year year = new Year(2012);
        boolean isLeapYear = year.isLeap();
        assertTrue(isLeapYear);
    }

    @Test
    public void notDivisibleBy4_shouldNotBeLeap() {
        Year year = new Year(2019);
        boolean isLeapYear = year.isLeap();
        assertFalse(isLeapYear);
    }

}