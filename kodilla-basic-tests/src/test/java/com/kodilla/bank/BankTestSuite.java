package com.kodilla.bank;

import com.kodilla.bank.homework.Bank;
import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {


    @Test
    public void shouldBeZeroIfBankDoesntHaveCashmashines() {//powinien zwrócić zero jesli bank nie ma żadnych bankomatów
        Bank bank = new Bank();
        assertEquals(0, bank.balance());

    }

    @Test
    public void shouldCalculateBalance() { //

        Bank bank = new Bank();

        CashMachine cashMachine = new CashMachine();
        cashMachine.bank(100);

        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.bank(200);
        cashMachine1.bank(-100);


        bank.addCashMachine(cashMachine);
        bank.addCashMachine(cashMachine1);


        double balance = bank.balance();

        assertEquals(200, balance);

    }


    @ Test
    public void shouldCountNegativeTransactions(){
        Bank bank = new Bank();

        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.bank(100);
        cashMachine1.bank(200);
        cashMachine1.bank(-100);

        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.bank(-100);
        cashMachine2.bank(-200);
        cashMachine2.bank(-100);

        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);

        int count = bank.negativeCountOfTransactions();

        assertEquals(4, count);

    }

    @Test
    public void shouldCountPositiveTransactions(){
        Bank bank = new Bank();

        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.bank(100);
        cashMachine1.bank(200);
        cashMachine1.bank(-100);

        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.bank(-100);
        cashMachine2.bank(-200);
        cashMachine2.bank(-100);

        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);

        int count = bank.positiveCountOfTransactions();

        assertEquals(2, count);
    }
}
