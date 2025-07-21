package com.kodilla.pojazd;

public class Pojazd {
    private double speed;
    private String colour;

    public Pojazd(double speed, String colour) {
        this.speed = speed;
        this.colour = colour;
    }

    public double getSpeed() {
        return speed;
    }

    public String getColour() {
        return colour;
    }

    public void jedz(){
        System.out.println("Pojazd jedzie");
    }
}
