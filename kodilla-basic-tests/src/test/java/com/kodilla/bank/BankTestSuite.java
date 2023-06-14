package com.kodilla.bank;

import com.kodilla.bank.homework.Bank;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void shouldHaveZeroLength(){
        Bank bank = new Bank();
        int[]cash = bank.addCashMachine();
        assertEquals(0,cash.length);
    }
    @Test
    public void shouldBeZeroIfBankDoesntHaveTransactions(){
        Bank bank = new Bank();
        assertEquals(0, bank.balance());

    }

}
