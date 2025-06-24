package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Shop {
    List<Order> orders = new ArrayList<>();

    public void addOrder(Order order){
        if (!orders.contains(order)) {
            orders.add(order);
        }
    }

    public List<Order>  getOrderByDate(LocalDate firstDate, LocalDate secondDate){
        return orders.stream()
                .filter(order -> (order.getDateOfOrder().isAfter(firstDate) || order.getDateOfOrder().isEqual(firstDate)) && (order.getDateOfOrder().isBefore(secondDate) || order.getDateOfOrder().isEqual(secondDate)))
                .collect(Collectors.toList());
    }

    public List<Order> getOrderByValueOfOrder(double firstValueOfOrder, double secondValueOfOrder){
        return orders.stream()
                .filter(order -> (order.getValueOfOrder() > firstValueOfOrder) && order.getValueOfOrder() < secondValueOfOrder)
                .collect(Collectors.toList());

    }

    public int getCountOfOrder(){
        return orders.size();

    }

    public double sumAllOrders(){
        return orders.stream()
                .mapToDouble(Order::getValueOfOrder)
                .sum();
    }
}
