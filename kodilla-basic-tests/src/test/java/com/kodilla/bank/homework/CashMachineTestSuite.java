package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    @Test
    public void shouldHaveZeroLength() {
        CashMachine cashMachine = new CashMachine();
        int[] values = cashMachine.getTransactions();
        assertEquals(0, values.length);
    }

    @Test
    public void shouldAddElementsToArray() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(1);
        cashMachine.add(-1);

        int[] transactions = cashMachine.getTransactions();
        assertEquals(2, transactions.length);
        assertEquals(1, transactions[0]);
        assertEquals(-1, transactions[1]);
    }

    @Test
    public void ShouldNotAddZeroToArray() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(0);

        int[] transactions = cashMachine.getTransactions();
        assertEquals(0, transactions.length);
    }

    @Test
    public void sumOfDeposits(){
        //given
        CashMachine cashMachine = new CashMachine();
        //when
        cashMachine.add(100);
        cashMachine.add(200);
        cashMachine.add(1000);
        //then
        assertEquals(1300,cashMachine.saldoCashMachine());
    }

    @Test
    public void sumOfWithdrawals(){
        //given
        CashMachine cashMachine = new CashMachine();
        //when
        cashMachine.add(-100);
        cashMachine.add(-200);
        cashMachine.add(-1000);
        //then
        assertEquals(-1300,cashMachine.saldoCashMachine());
    }

    @Test
    public void sumOfDepositsAndWithdrawals(){
        //given
        CashMachine cashMachine = new CashMachine();
        //when
        cashMachine.add(-100);
        cashMachine.add(-200);
        cashMachine.add(3000);
        cashMachine.add(-2000);
        //then
        assertEquals(700,cashMachine.saldoCashMachine());
    }

    @Test
    public void countOfTransactions(){
        //given
        CashMachine cashMachine = new CashMachine();
        //when
        cashMachine.add(-100);
        cashMachine.add(-200);
        cashMachine.add(3000);
        cashMachine.add(-2000);
        // then
        assertEquals(4, cashMachine.countOfTransactions());
    }

    @Test
    public void countOfTransactionsWhenZeroTransactions(){
        //given
        CashMachine cashMachine = new CashMachine();
        //when
        // then
        assertEquals(0, cashMachine.countOfTransactions());
    }
}
