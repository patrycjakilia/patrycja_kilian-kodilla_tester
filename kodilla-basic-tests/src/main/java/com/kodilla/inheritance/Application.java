package com.kodilla.inheritance;

public class Application {
    public static void main(String[] args) {
        Car car = new Car(4,5);
        car.turnOnLights();
        Convertible convertible = new Convertible(2,3);
        convertible.turnOnLights();
        System.out.println(convertible.getSeats());
        convertible.displayNumberOfSeats();
    }
}
