package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {

    @Test
    public void getOrder() throws Exception{
    Warehouse warehouse = new Warehouse();
    Order purchase1 = new Order("ZK1");
    Order purchase2 = new Order("ZK2");

    warehouse.addOrder(purchase1);
    warehouse.addOrder(purchase2);

    assertEquals("ZK2", purchase2.getNumber());

    }

    @Test
    public void getOrder_withException(){
        Warehouse warehouse = new Warehouse();
        Order purchase1 = new Order("ZK1");
        Order purchase2 = new Order("ZK2");

        warehouse.addOrder(purchase1);
        warehouse.addOrder(purchase2);

        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("ZK3"));
    }

}