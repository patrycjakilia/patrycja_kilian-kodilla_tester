package com.kodilla.konto;

public class Main {
    public static void main(String[] args) {
        KontoBankowe kontoBankowe = new KontoBankowe(100);
        System.out.println("Saldo: " + kontoBankowe.getSaldo());
        kontoBankowe.wplata(200);
        System.out.println("Saldo: " + kontoBankowe.getSaldo());
        kontoBankowe.wyplata(50);
        System.out.println("Saldo: " + kontoBankowe.getSaldo());
    }
}
