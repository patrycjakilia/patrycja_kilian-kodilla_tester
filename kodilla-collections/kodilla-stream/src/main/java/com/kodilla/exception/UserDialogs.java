package com.kodilla.exception;

import java.util.Scanner;

public class UserDialogs {
    public static int getNumbersOfRounds(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Enter number of rounds: ");
            String s = scanner.nextLine();

            try{
                int round = Integer.parseInt(s);
                return round;
            } catch (Exception e){
                System.out.println("Wrong data. Enter only digits. Try again.");
            }
        }
    }
}
