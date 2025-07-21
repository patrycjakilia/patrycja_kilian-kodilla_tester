package com.kodilla.pracownik;

public abstract class Pracownik implements Zatrudnialny{
    private String name;
    public Pracownik(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }


}
