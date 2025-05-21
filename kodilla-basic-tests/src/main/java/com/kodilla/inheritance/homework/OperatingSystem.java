package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int yearOfIssue;

    public OperatingSystem(int yearOfIssue){
        this.yearOfIssue = yearOfIssue;
    }

    public void turnOn(){
        System.out.println("Operating system - Turn on");
    }

    public void turnOff(){
        System.out.println("Operating system - Turn off");
    }
}
