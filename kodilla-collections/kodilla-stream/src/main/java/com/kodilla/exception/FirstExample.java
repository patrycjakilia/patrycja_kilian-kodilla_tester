package com.kodilla.exception;

public class FirstExample {
    public static void main(String[] args) {
        String username = "Willy Wonka";
        String[] nameparts = username.split(" ");
        System.out.println("First name: " + nameparts[0]);
        System.out.println("Last name: " + nameparts[1]);
    }
}
