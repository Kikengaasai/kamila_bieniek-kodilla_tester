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

        CashMachine cashMachine = new CashMachine();
        cashMachine.bank(100);
        cashMachine.bank(200);
        cashMachine.bank(-100);

        double balance = cashMachine.getAccountBalance();

        assertEquals(200, balance);

    }


    @ Test
    public void shouldCountNegativeTransactions(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.bank(100);
        cashMachine.bank(200);
        cashMachine.bank(-100);

        int count = cashMachine.negativeTransactions();

        assertEquals(1, count);

    }

    @Test
    public void shouldCountPositiveTransactions(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.bank(100);
        cashMachine.bank(200);
        cashMachine.bank(-100);

        int count = cashMachine.positiveTransactions();

        assertEquals(2,count);

    }
}
