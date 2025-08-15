package com.kodilla.age;

public class PhoneOrder implements OrderChannel{

    @Override
    public void placeOder(){
        System.out.println("This is order from Phone.");
    }
}
