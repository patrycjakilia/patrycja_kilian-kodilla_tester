package com.kodilla.pojazd;

public class Samochod extends Pojazd{


    private String marka;
    public Samochod(double speed, String colour, String marka) {
        super(speed, colour);
        this.marka = marka;
    }

    public String getMarka() {
        return marka;
    }
}
