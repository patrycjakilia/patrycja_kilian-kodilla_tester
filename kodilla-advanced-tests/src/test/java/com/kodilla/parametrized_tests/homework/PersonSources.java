package com.kodilla.parametrized_tests.homework;


import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSources {

     static Stream<Arguments> provideValueForTestingBMI() {
        return Stream.of(
                Arguments.of(1.70, 42, "Very severely underweight"),
                Arguments.of(1.70, 44, "Severely underweight"),
                Arguments.of(1.70, 49, "Underweight"),
                Arguments.of(1.70, 64, "Normal (healthy weight)"),
                Arguments.of(1.70, 80, "Overweight"),
                Arguments.of(1.70, 93, "Obese Class I (Moderately obese)"),
                Arguments.of(1.70, 107, "Obese Class II (Severely obese)"),
                Arguments.of(1.70, 121, "Obese Class III (Very severely obese)"),
                Arguments.of(1.70, 136, "Obese Class IV (Morbidly Obese)"),
                Arguments.of(1.70, 160, "Obese Class V (Super Obese)"),
                Arguments.of(1.70, 190, "Obese Class VI (Hyper Obese)")
                );
    }

    }
