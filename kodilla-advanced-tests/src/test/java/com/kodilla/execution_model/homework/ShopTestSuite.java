package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {
    Shop shop = new Shop();
    Order zk1 = new Order(150.99, LocalDate.of(2025, 6, 24), "pk");
    Order zk2 = new Order(259.99, LocalDate.of(2025, 7, 1), "ar");
    Order zk3 = new Order(309.99, LocalDate.of(2025, 5, 3), "kc");
    Order zk4 = new Order(456.99, LocalDate.of(2025, 3, 30), "bt");
    Order zk5 = new Order(1000.99, LocalDate.of(2025, 1, 1), "mg");

    @BeforeEach
    public void initializeShop() {
        shop.addOrder(zk1);
        shop.addOrder(zk2);
        shop.addOrder(zk3);
        shop.addOrder(zk4);
        shop.addOrder(zk5);
    }

    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }

    @Test
    public void addOrder(){
        assertEquals(5, shop.getCountOfOrder());
    }

    @Test
    public void shouldNotAddDuplicateOrder() {
        Order duplicate = new Order(150.99, LocalDate.of(2025, 6, 24), "pk");
        shop.addOrder(duplicate);
        assertEquals(5, shop.getCountOfOrder());
    }

    @Test
    public void getOrderByValue(){
        List <Order> result = shop.getOrderByValueOfOrder(250,500);
        assertEquals(3, result.size());
    }

    @Test
    public void getOrderByDate(){
        List <Order> result = shop.getOrderByDate(LocalDate.of(2025, 4, 1),  LocalDate.of(2025, 6, 30));
        assertEquals(2, result.size());
    }

    @Test void getCountOfOrder(){
        assertEquals(5,shop.getCountOfOrder());
    }

    @Test void sumOfOderValue(){
        double result = zk1.getValueOfOrder() + zk2.getValueOfOrder() + zk3.getValueOfOrder() + zk4.getValueOfOrder() + zk5.getValueOfOrder();
        assertEquals(result, shop.sumAllOrders());
    }



}