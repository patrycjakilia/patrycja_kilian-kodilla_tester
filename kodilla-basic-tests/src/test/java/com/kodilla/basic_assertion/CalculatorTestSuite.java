package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum(){
        Calculator calculator = new Calculator();
        double a = 50;
        double b = 80;
        double addResult = calculator.add(a,b);
        assertEquals(130, addResult);
    }

    @Test
    public void testSub(){
        Calculator calculator = new Calculator();
        double a = 2.43;
        double b = 1;
        double subResult = calculator.sub(a,b);
        assertEquals(1.43, subResult, 0.1);

    }

    @Test
    public void testSquareGreaterThanZero(){
        Calculator calculator = new Calculator();
        double a = 3;
        double squareResult = calculator.square(a);
        assertEquals(9, squareResult);
    }

    @Test
    public void testSquareLessThanZero(){
        Calculator calculator = new Calculator();
        double a = -3;
        double squareResult = calculator.square(a);
        assertEquals(9, squareResult);
    }

    @Test
    public void testSquareEqualToZero(){
        Calculator calculator = new Calculator();
        double a = 0;
        double squareResult = calculator.square(a);
        assertEquals(0, squareResult);
    }
}
