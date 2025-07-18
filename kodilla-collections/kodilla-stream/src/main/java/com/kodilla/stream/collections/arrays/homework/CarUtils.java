package com.kodilla.stream.collections.arrays.homework;

import com.kodilla.stream.collections.interfaces.homework.Audi;
import com.kodilla.stream.collections.interfaces.homework.Car;
import com.kodilla.stream.collections.interfaces.homework.Ford;
import com.kodilla.stream.collections.interfaces.homework.Opel;

public class CarUtils {
    public static void describeCar(Car car){
        System.out.println("------------------------------");
        System.out.println("Car kind: " + getCarName(car));
        System.out.println("Car speed: " + car.getSpeed());
    }

    private static String getCarName(Car car) {
        if (car instanceof Ford)
            return "Ford";
        else if (car instanceof Audi)
            return "Audi";
        else if (car instanceof Opel)
            return "Opel";
        else
            return "Unknown shape name";
    }
}
