package com.kodilla.bank.homework;

public class CashMachine {
    private int [] transactions;
    private int size;


    public CashMachine(){
        this.size = 0;
        this.transactions = new int[0];
    }

    public void add(int transaction){
        if(transaction != 0) {
            this.size++;
            int[] newTab = new int[this.size];
            System.arraycopy(transactions, 0, newTab, 0, transactions.length);
            newTab[this.size - 1] = transaction;
            this.transactions = newTab;
        }
    }

    public int[] getTransactions() {
        return transactions;
    }

    public int saldoCashMachine(){
        int sum = 0;
        for (int i = 0; i<transactions.length; i++){
            sum += transactions[i];
        }
        return sum;
    }

    public int countOfTransactions(){
        return transactions.length;
    }
}
