package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTest {
    private GamblingMachine gamblingMachine = new GamblingMachine();


    @ParameterizedTest
    @CsvFileSource(resources = "/invalid-numbers.csv")
    public void returnThrowIfSetInvalidValue(String numberline){
        Set<Integer> numbers = Arrays.stream(numberline.split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toSet());

        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(numbers));
    }

/*    @ParameterizedTest
    @CsvFileSource(resources = "/valid-numbers.csv")
    public void returnCountIfSetValidValue(String numberline) throws InvalidNumbersException {
        Set<Integer> numbers = Arrays.stream(numberline.split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toSet());


    }*/
}