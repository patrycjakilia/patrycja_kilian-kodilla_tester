package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.collections.arrays.homework.CarUtils.describeCar;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Car car1 = new Ford(10);
        Car car2 = new Audi(20);
        Car car3 = new Opel(30);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        cars.remove(2);
        cars.remove(car1);

        System.out.println(cars.size());

        for (Car car : cars){
            describeCar(car);
        }
    }
}
