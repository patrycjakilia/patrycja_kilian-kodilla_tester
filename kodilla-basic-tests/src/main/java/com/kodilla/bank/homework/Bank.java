package com.kodilla.bank.homework;

public class Bank {
    private CashMachine [] cashMachine;

    public Bank(CashMachine [] cashMachine){
        this.cashMachine = cashMachine;
    }

    public CashMachine[] getCashMachine() {
        return cashMachine;
    }

    public int saldoCashMachines(){
        int sum = 0;
        for (int i = 0; i<cashMachine.length; i++){
            sum += cashMachine[i].saldoCashMachine();
        }
        return sum;
    }

    public int countOfWithdrawal(){
        int count = 0;
        for (int i = 0; i < cashMachine.length; i++) {
            int[] transactions = cashMachine[i].getTransactions();
            for (int j = 0; j < transactions.length; j++) {
                if (transactions[j] < 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public int countOfDeposits(){
        int count = 0;
        for (int i = 0; i < cashMachine.length; i++) {
            int[] transactions = cashMachine[i].getTransactions();
            for (int j = 0; j < transactions.length; j++) {
                if (transactions[j] > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public int avgOfDeposits() {
        int sum = 0;
        int count =0;
        for (int i = 0; i < cashMachine.length; i++) {
            int[] transactions = cashMachine[i].getTransactions();
            for (int j = 0; j < transactions.length; j++) {
                if (transactions[j] > 0) {
                    sum += transactions[j];
                    count++;
                }
            }
        }
        if(count == 0){
            return 0;
        }
        return sum / count;
    }

    public int avgOfWithdrawal() {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < cashMachine.length; i++) {
            int[] transactions = cashMachine[i].getTransactions();
            for (int j = 0; j < transactions.length; j++) {
                if (transactions[j] < 0) {
                    sum += transactions[j];
                    count++;
                }
            }
        }
        if(count == 0){
            return 0;
        }
        return sum / count;
    }
}
