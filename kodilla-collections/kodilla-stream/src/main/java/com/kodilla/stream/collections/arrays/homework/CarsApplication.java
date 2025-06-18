package com.kodilla.stream.collections.arrays.homework;

import com.kodilla.stream.collections.interfaces.homework.Audi;
import com.kodilla.stream.collections.interfaces.homework.Car;
import com.kodilla.stream.collections.interfaces.homework.Ford;
import com.kodilla.stream.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarsApplication {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15) + 1];

        for (int i = 0; i < cars.length; i++){
            cars[i] = drawCar();
        }
        for(Car car : cars){
        CarUtils.describeCar(car);
        }
    }

    public static Car drawCar(){
        int randomCar = RANDOM.nextInt(2);
        int randomSpeed = getRandomSpeed();

        if(randomCar == 0)
            return new Ford(100 + randomSpeed);
        else if (randomCar == 1)
            return new Audi(50 + randomSpeed);
        else
            return new Opel(20 + randomSpeed);
    }

    private static int getRandomSpeed() {
        return RANDOM.nextInt(250);
    }
}
