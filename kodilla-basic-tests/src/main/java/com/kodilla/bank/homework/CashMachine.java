package com.kodilla.bank.homework;

public class CashMachine {

    private int[] amounts;
    private int size;

    public CashMachine() {
        this.amounts = new int[0];
    }

    public void bank(int amount) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(amounts, 0, newTab, 0, amounts.length);
        newTab[this.size - 1] = amount;
        this.amounts = newTab;
    }

    public int[] getAmounts() {
        return amounts;
    }

    public double getAccountBalance() {
        if (this.amounts.length == 0) {
            return 0;
        }
        double balance = 0;
        for (int i = 0; i < this.amounts.length; i++) {
            balance += this.amounts[i];
        }
        return balance;
    }



}

