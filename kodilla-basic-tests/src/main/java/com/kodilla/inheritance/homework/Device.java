package com.kodilla.inheritance.homework;

public class Device extends OperatingSystem{

    public Device(int yearOfIssue){
        super(yearOfIssue);
    }

    @Override
    public void turnOn(){
        System.out.println("Device - Turn on");
    }

    @Override
    public void turnOff(){
        System.out.println("Device - Turn off");
    }
}
