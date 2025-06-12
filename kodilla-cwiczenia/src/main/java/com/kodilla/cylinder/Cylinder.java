package com.kodilla.cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public Cylinder(){
        super();
        this.height = 1;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return Math.PI*getRadius()*getRadius()*getHeight();
    }
}
