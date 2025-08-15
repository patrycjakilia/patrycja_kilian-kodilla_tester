package com.kodilla.age;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
     List<Product> products = new ArrayList<>();
     private double finalAmout;
     LocalDate date;

    public Order(List<Product> products, double finalAmonut, LocalDate date) {
        this.products = products;
        this.finalAmout = finalAmonut;
        this.date = date;
    }

    public List<Product> getProducts() {
        return products;
    }

    public double getFinalAmout() {
        return finalAmout;
    }

    public LocalDate getDate() {
        return date;
    }

    public void addProducts(Product product) {
        products.add(product);
        finalAmout += product.getPrice(); // Dodaj automatycznie do końcowej kwoty

    }

    public double purchaseOrder(){
        int countOfProducts = 0;
        double amount = 0;
        for (Product product : products){
            System.out.println("Nazwa produktu z listy:  " + product.getName());
            System.out.println("Cena: " + product.getPrice());
            double price = product.getPrice();
             amount += price;
            countOfProducts++;
        }

        System.out.println("Liczba pduktów zamówienia: " + countOfProducts + " Łączna kwota zamówienia: " + amount);

        return amount;
    }

}
