package com.kodilla.execution_model.homework;

import java.time.LocalDate;

public class Order {
    private double valueOfPurchase;
    private LocalDate dateOfPurchase;
    private String login;

    public Order(double valueOfPurchase, LocalDate dateOfPurchase, String login) {
        this.valueOfPurchase = valueOfPurchase;
        this.dateOfPurchase = dateOfPurchase;
        this.login = login;
    }

    public double getValueOfPurchase() {
        return valueOfPurchase;
    }

    public LocalDate getDateOfPurchase() {
        return dateOfPurchase;
    }

    public String getLogin() {
        return login;
    }
}
