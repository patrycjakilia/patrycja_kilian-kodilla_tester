package com.kodilla.jacoco;

import org.junit.Assert;
import org.junit.Test;

public class YearTest {

    @Test
    public void shouldBeLeapYearIfDivisibleBy400() {
        Year year = new Year(1600);
        boolean isLeapYear = year.isLeap();
        Assert.assertTrue(isLeapYear);
    }

    @Test
    public void divisibleBy100Not400_shouldNotBeLeap() {
        Year year = new Year(1900);
        boolean isLeapYear = year.isLeap();
        Assert.assertFalse(isLeapYear);
    }

    @Test
    public void divisibleBy4Not100_shouldBeLeap() {
        Year year = new Year(2012);
        boolean isLeapYear = year.isLeap();
        Assert.assertTrue(isLeapYear);
    }

    @Test
    public void notDivisibleBy4_shouldNotBeLeap() {
        Year year = new Year(2019);
        boolean isLeapYear = year.isLeap();
        Assert.assertFalse(isLeapYear);
    }

}