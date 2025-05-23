package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum(){
        Calculator calculator = new Calculator();
        int a = 50;
        int b = 80;
        int addResult = calculator.add(a,b);
        assertEquals(130, addResult);
    }
}
