package com.kodilla.animals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    public void makeSoundDog(){
        Animal animal = new Dog();
        String result = animal.makeSound();
        assertEquals("Woof", result);
    }

    @Test
    public void makeSoundCat(){
        Animal animal = new Cat();
        String result = animal.makeSound();
        assertEquals("Meow", result);
    }

}