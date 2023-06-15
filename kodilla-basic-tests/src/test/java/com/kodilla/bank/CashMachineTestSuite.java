package com.kodilla.bank;

import com.kodilla.bank.homework.CashMachine;
import com.kodilla.school.Grades;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    @Test
    public void shouldHaveZeroLength() {
        CashMachine cashMachine = new CashMachine();
        double amounts = cashMachine.getAccountBalance();
        assertEquals(0, amounts);
    }

    @Test
    public void shouldAddTwoElementsToArray() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.bank(100);
        cashMachine.bank(200);

        int[] amounts = cashMachine.getAmounts();
        assertEquals(2, amounts.length);
        assertEquals(100, amounts[0]);
        assertEquals(200, amounts[1]);
    }

    @Test
    public void shouldCalculateAccountBalance() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.bank(100);
        cashMachine.bank(-200);

        assertEquals(-100, cashMachine.getAccountBalance(), 0.01);

    }

    @Test
    public void shouldCountNegativeTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.bank(100);
        cashMachine.bank(-200);

        assertEquals(1, cashMachine.negativeTransactions(), 0.01);

    }

    @Test
    public void shouldCountPositiveTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.bank(100);
        cashMachine.bank(-200);

        assertEquals(1, cashMachine.positiveTransactions(), 0.01);

    }

    @Test
    public void shouldSumNegativeTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.bank(100);
        cashMachine.bank(-200);
        cashMachine.bank(-300);

        assertEquals(-500, cashMachine.sumNegativeTransactions(), 0.01);

    }

    @Test
    public void shouldSumPositiveTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.bank(100);
        cashMachine.bank(-200);
        cashMachine.bank(-300);

        assertEquals(100, cashMachine.sumPositiveTransactions(), 0.01);

    }
}