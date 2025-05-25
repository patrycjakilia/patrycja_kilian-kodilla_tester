package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void saldoOfCacheMachinesPositiveValues(){
        //given
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine cashMachine3 = new CashMachine();
        CashMachine[] machines = {cashMachine1, cashMachine2, cashMachine3};

        //when
        cashMachine1.add(100);
        cashMachine2.add(300);
        cashMachine3.add(1000);
        Bank bank = new Bank(machines);

        //then
        assertEquals(1400, bank.saldoCashMachines());
    }

    @Test
    public void saldoOfCacheMachinesNegativeValues(){
        //given
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine cashMachine3 = new CashMachine();
        CashMachine[] machines = {cashMachine1, cashMachine2, cashMachine3};

        //when
        cashMachine1.add(-100);
        cashMachine2.add(-300);
        cashMachine3.add(-1000);
        Bank bank = new Bank(machines);

        //then
        assertEquals(-1400, bank.saldoCashMachines());
    }

    @Test
    public void saldoOfCacheMachinesMixValues(){
        //given
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine cashMachine3 = new CashMachine();
        CashMachine[] machines = {cashMachine1, cashMachine2, cashMachine3};

        //when
        cashMachine1.add(100);
        cashMachine2.add(300);
        cashMachine3.add(-1000);
        Bank bank = new Bank(machines);

        //then
        assertEquals(-600, bank.saldoCashMachines());
    }
    @Test
    public void saldoOfCacheMachinesZeroValues(){
        //given
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine cashMachine3 = new CashMachine();
        CashMachine[] machines = {cashMachine1, cashMachine2, cashMachine3};

        //when
        Bank bank = new Bank(machines);

        //then
        assertEquals(0, bank.saldoCashMachines());
    }

    @Test
    public void countOfWithdrawalOnlyNegativeValues(){
        //given
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine cashMachine3 = new CashMachine();
        CashMachine[] machines = {cashMachine1, cashMachine2, cashMachine3};

        //when
        cashMachine1.add(-100);
        cashMachine2.add(-300);
        cashMachine3.add(-1000);
        Bank bank = new Bank(machines);

        //then
        assertEquals(3, bank.countOfWithdrawal());
    }

    @Test
    public void countOfWithdrawalOnlyPositiveValues(){
        //given
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine cashMachine3 = new CashMachine();
        CashMachine[] machines = {cashMachine1, cashMachine2, cashMachine3};

        //when
        cashMachine1.add(100);
        cashMachine2.add(300);
        cashMachine3.add(1000);
        Bank bank = new Bank(machines);

        //then
        assertEquals(0, bank.countOfWithdrawal());
    }

    @Test
    public void countOfWithdrawalMixValues(){
        //given
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine cashMachine3 = new CashMachine();
        CashMachine[] machines = {cashMachine1, cashMachine2, cashMachine3};

        //when
        cashMachine1.add(-100);
        cashMachine2.add(-300);
        cashMachine3.add(1000);
        Bank bank = new Bank(machines);

        //then
        assertEquals(2, bank.countOfWithdrawal());
    }

    @Test
    public void countOfWithdrawalZeroValues(){
        //given
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine cashMachine3 = new CashMachine();
        CashMachine[] machines = {cashMachine1, cashMachine2, cashMachine3};

        //when
        Bank bank = new Bank(machines);

        //then
        assertEquals(0, bank.saldoCashMachines());
    }

    @Test
    public void countOfDepositsOnlyPositiveValues(){
        //given
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine cashMachine3 = new CashMachine();
        CashMachine[] machines = {cashMachine1, cashMachine2, cashMachine3};

        //when
        cashMachine1.add(100);
        cashMachine2.add(300);
        cashMachine3.add(1000);
        Bank bank = new Bank(machines);

        //then
        assertEquals(3, bank.countOfDeposits());
    }

    @Test
    public void countOfDepositsOnlyNegativeValues(){
        //given
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine cashMachine3 = new CashMachine();
        CashMachine[] machines = {cashMachine1, cashMachine2, cashMachine3};

        //when
        cashMachine1.add(-100);
        cashMachine2.add(-300);
        cashMachine3.add(-1000);
        Bank bank = new Bank(machines);

        //then
        assertEquals(0, bank.countOfDeposits());
    }

    @Test
    public void countOfDepositsOnlyMixValues(){
        //given
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine cashMachine3 = new CashMachine();
        CashMachine[] machines = {cashMachine1, cashMachine2, cashMachine3};

        //when
        cashMachine1.add(100);
        cashMachine2.add(300);
        cashMachine3.add(1000);
        cashMachine1.add(100);
        cashMachine2.add(-300);
        cashMachine3.add(-1000);
        Bank bank = new Bank(machines);

        //then
        assertEquals(4, bank.countOfDeposits());
    }

    @Test
    public void countOfDepositsZeroValues(){
        //given
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine cashMachine3 = new CashMachine();
        CashMachine[] machines = {cashMachine1, cashMachine2, cashMachine3};

        //when
        Bank bank = new Bank(machines);

        //then
        assertEquals(0, bank.saldoCashMachines());
    }

    @Test
    public void avgOfDepositsPositiveValues(){
        //given
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine cashMachine3 = new CashMachine();
        CashMachine[] machines = {cashMachine1, cashMachine2, cashMachine3};

        //when
        cashMachine1.add(100);
        cashMachine2.add(100);
        cashMachine3.add(1000);
        Bank bank = new Bank(machines);

        //then
        assertEquals(400, bank.avgOfDeposits());
    }

    @Test
    public void avgOfDepositsNegativeValues(){
        //given
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine cashMachine3 = new CashMachine();
        CashMachine[] machines = {cashMachine1, cashMachine2, cashMachine3};

        //when
        cashMachine1.add(-100);
        cashMachine2.add(-100);
        cashMachine3.add(-1000);
        Bank bank = new Bank(machines);

        //then
        assertEquals(0, bank.avgOfDeposits());
    }

    @Test
    public void avgOfZeroDeposits(){
        //given
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine cashMachine3 = new CashMachine();
        CashMachine[] machines = {cashMachine1, cashMachine2, cashMachine3};

        //when
        Bank bank = new Bank(machines);

        //then
        assertEquals(0, bank.avgOfDeposits());
    }

    @Test
    public void avgOfWithdrawalNegativeValues(){
        //given
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine cashMachine3 = new CashMachine();
        CashMachine[] machines = {cashMachine1, cashMachine2, cashMachine3};

        //when
        cashMachine1.add(-100);
        cashMachine2.add(-100);
        cashMachine3.add(-1000);
        Bank bank = new Bank(machines);

        //then
        assertEquals(-400, bank.avgOfWithdrawal());
    }

    @Test
    public void avgOfWithdrawalPositiveValues(){
        //given
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine cashMachine3 = new CashMachine();
        CashMachine[] machines = {cashMachine1, cashMachine2, cashMachine3};

        //when
        cashMachine1.add(100);
        cashMachine2.add(100);
        cashMachine3.add(1000);
        Bank bank = new Bank(machines);

        //then
        assertEquals(0, bank.avgOfWithdrawal());
    }

    @Test
    public void avgOfZeroWithdrawal(){
        //given
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine cashMachine3 = new CashMachine();
        CashMachine[] machines = {cashMachine1, cashMachine2, cashMachine3};

        //when
        Bank bank = new Bank(machines);

        //then
        assertEquals(0, bank.avgOfWithdrawal());
    }


}
