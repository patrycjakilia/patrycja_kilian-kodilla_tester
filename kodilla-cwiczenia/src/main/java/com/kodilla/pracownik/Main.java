package com.kodilla.pracownik;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] randoms = new int[4];
        for (int i = 0; i < randoms.length; i++){
            randoms[i] = rand.nextInt(101);
            System.out.println(randoms[i]);
            if(randoms[i] % 2 == 0){
                System.out.println("Parzysta: " + randoms[i]);
            }
        }
    }
}
