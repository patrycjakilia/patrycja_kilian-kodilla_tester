package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Shop {
    List<Order> orders = new ArrayList<>();

    public List<Order>  addOrder(Order order){
        orders.add(order);
        return orders;
    }

    public List<Order>  getOrderByDate(LocalDate firstDate, LocalDate secondDate){
        return List<orders> orders
                .stream()
                .filter(order -> order.getDateOfPurchase().equals(firstDate)

    }

    public void getOrderByValueOfPurchase(double firstValueOfPurchase, double secondValueOfPurchase){

    }

    public void getCountOfOrder(){

    }

    public void sumAllOrders(){

    }
}
