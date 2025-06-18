package com.kodilla.stream.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Car ford = new Ford(100);
        doRace(ford);
        Car audi = new Audi(0);
        doRace(audi);
        Car opel = new Opel(50);
        doRace(opel);

    }

    private static void doRace(Car car){

        for(int i = 0; i<3; i++){
            car.increaseSpeed();
        }

        for (int i = 0; i<2; i++){
            car.decreaseSpeed();
        }

        System.out.println(car.getSpeed());
    }
}
