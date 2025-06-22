package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTest {

    private UserValidator validator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"xyz", "AXYZ", "123456789", "-._", "Ab123-._"})
    public void shouldReturnTrueIfUsernameIsCorrect(String text){
        assertTrue(validator.validateUsername(text));
    }

    @ParameterizedTest
    @ValueSource(strings = {"1", "?,!", "ŻŹa", ""})
    public void shouldReturnFalseIfUsernameIsIncorrect(String text){
        assertFalse(validator.validateUsername(text));
    }

    @ParameterizedTest
    @ValueSource(strings = {"jan.kowalski@example.pl", "a-b_1.2@sub.domain.co", "user@domain.a", ""})
    public void shouldReturnTrueIfEmailIsCorrect(String text){
        assertTrue(validator.validateEmail(text));
    }

    @ParameterizedTest
    @ValueSource(strings = {"user+folder@domain.com", ".user@domain.com", "user@domain.technology", "user..name@domain.com", "user@domain..com", "user@domain..com", "abc.example.com"})
    public void shouldReturnFalseIfEmailIsIncorrect(String text){
        assertFalse(validator.validateEmail(text));
    }


}