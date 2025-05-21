package com.kodilla.inheritance.homework;

public class Main {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(1999);
        operatingSystem.turnOff();
        operatingSystem.turnOn();
        Device device = new Device(2010);
        device.turnOff();
        device.turnOn();
        Phone phone = new Phone(2019);
        phone.turnOff();
        phone.turnOn();
    }
}
