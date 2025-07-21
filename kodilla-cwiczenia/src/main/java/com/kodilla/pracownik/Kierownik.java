package com.kodilla.pracownik;

public class Kierownik extends Pracownik{
    private double stawka;
    private double premia;

    public Kierownik(String name, double stawka, double premia) {
        super(name);
        this.stawka = stawka;
        this.premia = premia;
    }

    @Override
    public double obliczPensje() {
        return stawka+premia;
    }
    @Override
    public String getStanowisko(){
        return "Kierownik";
    }
}
