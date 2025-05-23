package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 30;
        int addResult = calculator.add(a,b);
        boolean addCorrect = ResultChecker.assertEquals(40, addResult);
        if(addCorrect){
            System.out.println("Metoda add dziala poprawnie dla liczb: " + a + " i " + b);
        } else {
            System.out.println("Metoda add dziala niepoprawnie dla liczb: " + a + " i " + b);
        }

        int subResult = calculator.sub(a,b);
        boolean subCorrect = ResultChecker.assertEquals(-20,subResult);
        if (subCorrect){
            System.out.println("Metoda sub dziala poprawnie dla liczb: " + a + " i " + b);
        }else{
            System.out.println("Metoda sub nie dziala poprawnie dla liczb: " + a + " i " + b);
        }

        int squareResult = calculator.square(a);
        boolean squareCorrect = ResultChecker.assertEquals(100, squareResult);
        if(squareCorrect){
            System.out.println("Metoda square dziala poprawnie dla liczby: " + a);
        }else {
            System.out.println("Metoda square dziala niepoprawnie dla liczby: " + a);
        }
    }
}
