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
    }



}
