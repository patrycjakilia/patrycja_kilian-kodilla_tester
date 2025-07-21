package com.kodilla.pojazd;

public class Main {
    public static void main(String[] args) {
        Samochod audi = new Samochod(120,"red", "Q8");
        audi.jedz();
        System.out.println("Audi: " + audi.getMarka() + " " + audi.getColour() + " " + audi.getSpeed());
    }
}
