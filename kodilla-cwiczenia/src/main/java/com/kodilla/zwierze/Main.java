package com.kodilla.zwierze;

public class Main {
    public static void main(String[] args) {
        Zwierze[] zwierze = {new Pies(), new Kot()};

        for (Zwierze z : zwierze ){
            z.dajGlos();
        }
    }
}
