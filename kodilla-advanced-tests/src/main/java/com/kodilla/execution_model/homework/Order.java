package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.Objects;

public class Order {
    private double valueOfOrder;
    private LocalDate dateOfOrder;
    private String login;

    public Order(double valueOfOrder, LocalDate dateOfOrder, String login) {
        this.valueOfOrder = valueOfOrder;
        this.dateOfOrder = dateOfOrder;
        this.login = login;
    }

    public double getValueOfOrder() {
        return valueOfOrder;
    }

    public LocalDate getDateOfOrder() {
        return dateOfOrder;
    }

    public String getLogin() {
        return login;
    }

    @Override
    public String toString() {
        return "Order{" +
                "valueOfOrder=" + valueOfOrder +
                ", dateOfOrder=" + dateOfOrder +
                ", login='" + login + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(valueOfOrder, order.valueOfOrder) == 0 && Objects.equals(dateOfOrder, order.dateOfOrder) && Objects.equals(login, order.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valueOfOrder, dateOfOrder, login);
    }
}
