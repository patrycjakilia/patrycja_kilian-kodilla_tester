package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Cracow", 0.9));
        stamps.add(new Stamp("Warsaw", 1.1));
        stamps.add(new Stamp("Gdansk", 1));
        stamps.add(new Stamp("Warsaw", 1.1));
        stamps.add(new Stamp("Gdansk", 1));

        System.out.println("Size of collection: " + stamps.size());

        for (Stamp stamp : stamps){
            System.out.println(stamp);
        }


    }
}
