package com.kodilla.age;

public class AppOrder implements OrderChannel{

    @Override
    public void placeOder(){
        System.out.println("This is order from App.");
    }
}
