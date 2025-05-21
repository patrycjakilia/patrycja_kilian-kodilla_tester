package com.kodilla.inheritance.homework;

public class Phone extends OperatingSystem{

    public Phone(int yearOfIssue){
        super(yearOfIssue);
    }

    @Override
    public void turnOn(){
        System.out.println("Phone - Turn on");
    }

    @Override
    public void turnOff(){
        System.out.println("Phone - Turn off");
    }
}
