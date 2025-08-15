package com.kodilla.age;

public class Product {
    private double price;
    private Category days;
    private String name;

    public Product(double price, Category days, String name) {
        this.price = price;
        this.days = days;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public Category getDays() {
        return days;
    }

    public String getName() {
        return name;
    }


}
