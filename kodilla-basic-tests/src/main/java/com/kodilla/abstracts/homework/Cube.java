package com.kodilla.abstracts.homework;

public class Cube extends Shape{
    private double length;

    public Cube(double length){
        this.length = length;
    }

    @Override
    public double surfaceArea() {
        return 6 * length * length;
    }

    @Override
    public double circuit() {
        return 12 * length;
    }
}
