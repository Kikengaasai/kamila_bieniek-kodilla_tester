package com.kodilla.bank;

import com.kodilla.bank.homework.Bank;
import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {



    @Test
    public void shouldBeZeroIfBankDoesntHaveTransactions(){
        Bank bank = new Bank();
        assertEquals(0, bank.balance());

    }

    public void shouldCalculateBalance(){

        Bank bank = new Bank();
        bank.addCashMachine(new CashMachine());

    }
}
