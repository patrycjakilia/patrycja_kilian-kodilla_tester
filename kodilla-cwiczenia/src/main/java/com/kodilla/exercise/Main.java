package com.kodilla.exercise;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Patrycja", 12));
        personList.add(new Person("Maria", 18));
        personList.add(new Person("Kamil", 35));

        for (Person person : personList){
            System.out.println(person);
        }

        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog("Azor", "Kundel");
        dogs[1] = new Dog("Pimpek", "Maltańczyk");
        dogs[2] = new Dog("Hugo", "Jamnik");

        dogs[1].setBreed("Husky");
        dogs[0].setName("Mati");

        for(Dog dog : dogs){
            System.out.println(dog);
        }
    }
}
