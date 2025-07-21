package com.kodilla.pracownik;

public class Programista extends Pracownik {
    private double hour;
    private double value;

    public Programista(String name, double hour, double value) {
        super(name);
        this.hour = hour;
        this.value = value;
    }

    @Override
    public double obliczPensje() {
        return hour*value;
    }

    @Override
    public String toString() {
        return "Programista: " +
                getName() +
                ", pensja:" + obliczPensje();
    }
    @Override
    public String getStanowisko(){
        return "Progrmista";
    }
}
