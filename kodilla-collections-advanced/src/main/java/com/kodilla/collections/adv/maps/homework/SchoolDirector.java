package com.kodilla.collections.adv.maps.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SchoolDirector {
    public static void main(String[] args) {
        Map<Principal, School> schoolMap = new LinkedHashMap<>();

        Principal principal1 = new Principal("Mariusz", "Mariuszowski");
        Principal principal2 = new Principal("Mateusz", "Mateuszowski");
        Principal principal3 = new Principal("Kacper", "Kacperkowski");

        School school1 = new School("Szkoła Podstawowa nr 1 w Krakowie", Arrays.asList(10, 20, 30, 28, 22, 31, 34, 18));
        School school2 = new School("Szkoła Podstawowa nr 10 w Krakowie", Arrays.asList(20, 20, 20, 20, 20, 20, 20, 20));
        School school3 = new School("Szkoła Podstawowa nr 100 w Krakowie", Arrays.asList(30, 20, 30, 20, 30, 30, 30, 20));


        schoolMap.put(principal1,school1);
        schoolMap.put(principal2,school2);
        schoolMap.put(principal3,school3);

        for (Map.Entry<Principal, School> schoolInfo : schoolMap.entrySet()){
            System.out.println("Dyrektor: " + schoolInfo.getKey().getFirstName() + " " + schoolInfo.getKey().getLastName() + " Szkoła: " + schoolInfo.getValue().getSchool() + " Średnia " + schoolInfo.getValue().getSum());
        }
    }
}
