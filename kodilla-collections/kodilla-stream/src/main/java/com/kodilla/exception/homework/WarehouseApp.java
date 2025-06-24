package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        warehouse.addOrder(new Order("123"));
        warehouse.addOrder(new Order("ABC"));

        try {
            Order found = warehouse.getOrder("123");
            System.out.println("Znaleziono zamówienie: " + found.getNumber());

            warehouse.getOrder("XYZ"); // powinno rzucić wyjątek
        } catch (OrderDoesntExistException e) {
            System.out.println("Błąd: " + e.getMessage());
        }
    }
}

