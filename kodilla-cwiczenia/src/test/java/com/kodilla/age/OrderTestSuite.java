package com.kodilla.age;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderTestSuite {

    @Test
    public void makeOrder(){
        Product product1 = new Product(120, Category.FOOD, "Bread");
        Product product2 = new Product(4000.99, Category.ELECTRONICS, "Computer");
        Product product3 = new Product(120, Category.BOOKS, "Harry Potter");

        List<Product> products = new ArrayList<>();

        products.add(product1);
        products.add(product2);
        products.add(product3);

        Order order = new Order(products, 4240.99, LocalDate.now());

        double expectedResult = order.getFinalAmout();
        double result = order.purchaseOrder();

        assertEquals(expectedResult, result);

    }

}