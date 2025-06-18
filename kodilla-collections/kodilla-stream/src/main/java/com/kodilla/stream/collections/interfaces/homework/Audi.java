package com.kodilla.stream.collections.interfaces.homework;

public class Audi implements Car {
    private int speed;

    public Audi(int speed) {
        this.speed = speed;
    }

    public int getSpeed(){
        return speed;
    }

    public void increaseSpeed(){
        speed = speed + 100;
    }

    public void decreaseSpeed(){
        speed = speed / 2;
    }
}
