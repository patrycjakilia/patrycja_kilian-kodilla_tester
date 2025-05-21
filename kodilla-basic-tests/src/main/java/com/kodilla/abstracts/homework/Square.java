package com.kodilla.abstracts.homework;

public class Square extends Shape{
    private double length;

    public Square(double length){
        this.length = length;
    }

    @Override
    public double surfaceArea() {
        return length * length;
    }

    @Override
    public double circuit() {
        return 4*length;
    }
}
