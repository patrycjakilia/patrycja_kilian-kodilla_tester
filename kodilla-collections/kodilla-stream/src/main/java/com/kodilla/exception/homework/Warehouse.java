package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class Warehouse {
    private List<Order> orders = new ArrayList<>();

    public List<Order> addOrder(Order order){
        orders.add(order);
        return orders;
    }

    public Order getOrder(String number){
        Optional<Order> order = orders.stream()
                .filter(o -> o.getNumber().equals(number))
                .findFirst();

    }
}
