package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Shop {
    List<Order> orders = new ArrayList<>();

    public List<Order>  addOrder(Order order){
        orders.add(order);
        return orders;
    }

    public List<Order>  getOrderByDate(LocalDate firstDate, LocalDate secondDate){
        return orders.stream()
                .filter(order -> (order.getDateOfPurchase().isAfter(firstDate) || order.getDateOfPurchase().isEqual(firstDate)) && (order.getDateOfPurchase().isBefore(secondDate) || order.getDateOfPurchase().isEqual(secondDate)))
                .collect(Collectors.toList());
    }

    public void getOrderByValueOfPurchase(double firstValueOfPurchase, double secondValueOfPurchase){

    }

    public void getCountOfOrder(){

    }

    public void sumAllOrders(){

    }
}
