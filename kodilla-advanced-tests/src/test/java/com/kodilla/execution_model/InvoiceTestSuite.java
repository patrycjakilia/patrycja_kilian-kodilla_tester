package com.kodilla.execution_model;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTestSuite {
    Invoice invoice = new Invoice();
    Item computer = new Item("Computer", 2999.99);
    Item keyboard = new Item("Keyboard", 210.98);

    @BeforeEach
    public void initializeInvoice() {
        invoice.addItem(computer);
        invoice.addItem(keyboard);
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
    public void addItem(){
        int numberOfItems = invoice.getSize();
        assertEquals(2,numberOfItems);
    }



    @Test
    public void addItemCheckNameAndPrice() {
        invoice.getItem(0);

        assertEquals("Computer", computer.getName());
        assertEquals(2999.99, computer.getPrice());
    }

    @Test
    public void getNegativeElement(){
        assertEquals(null,invoice.getItem(-1));
    }

    @Test
    public void getElementOutOfRange(){
        assertEquals(null,invoice.getItem(100));

    }

    @Test
    public void clearInvoice(){
        //When
        invoice.clear();

        //Then
        assertEquals(0, invoice.getSize());

    }
}