package com.kodilla.konto;

public class KontoBankowe {
    private double saldo;

    public KontoBankowe(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }


    public double wplata(double kwota){
        if(kwota > 0){
            saldo = saldo + kwota;
        }
        return saldo;
    }

    public double wyplata(double kwota){
        if(kwota<=saldo){
            saldo = saldo - kwota;
        }
        return saldo;
    }// – odejmuje środki, jeśli są dostępne

}
