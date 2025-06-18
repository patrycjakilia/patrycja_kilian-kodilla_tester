package com.kodilla.stream.collections.sets;

import java.util.Objects;

public class Order {
    private String orderNumber;
    private String productNumber;
    private double quantity;

    public Order(String productNumber, String orderNumber, double quantity) {
        this.productNumber = productNumber;
        this.orderNumber = orderNumber;
        this.quantity = quantity;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(quantity, order.quantity) == 0 && Objects.equals(orderNumber, order.orderNumber) && Objects.equals(productNumber, order.productNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderNumber, productNumber, quantity);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber='" + orderNumber + '\'' +
                ", productNumber='" + productNumber + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
