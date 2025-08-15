package com.kodilla.age;

public class WebOrder implements OrderChannel{

    @Override
    public void placeOder(){
        System.out.println("This is order from Web.");
    }
}
