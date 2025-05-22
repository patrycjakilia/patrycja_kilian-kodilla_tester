package com.kodilla.abstracts.homework;

public class Application {

    public static void main(String[] args) {
        Recktangle recktangle = new Recktangle(10, 20);
        System.out.println("Pole prostokąta: " + recktangle.surfaceArea());
        System.out.println("Obwód prostokąta: " + recktangle.circuit());

        Square square = new Square(10);
        System.out.println("Pole kwadratu: " + square.surfaceArea());
        System.out.println("Obwód kwadratu: " + square.circuit());

        Cube cube = new Cube(20);
        System.out.println("Pole sześcianu: " +cube.surfaceArea());
        System.out.println("Obwód sześcianu: " + cube.circuit());

        Job hairdresser = new Hairdresser(4500, "hair cutting");
        Person person1 = new Person("Patrycja",20, hairdresser);
        person1.returnResposibilities();

        Job carMechanic = new CarMechanic(6000, "car reapir");
        Person person2 = new Person("Mateusz",30, carMechanic);
        person2.returnResposibilities();

        Job cooker = new Cooker(6000, "cooking");
        Person person3 = new Person("Marta",30, cooker);
        person3.returnResposibilities();

    }
}
