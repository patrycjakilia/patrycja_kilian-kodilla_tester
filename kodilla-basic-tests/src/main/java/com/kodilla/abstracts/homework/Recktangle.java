package com.kodilla.abstracts.homework;

public class Recktangle extends Shape {
    private double length;
    private double width;

    public Recktangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double surfaceArea() {
        return length * width;
    }

    @Override
    public double circuit() {
        return (2*length)+(2*width);
    }
}
