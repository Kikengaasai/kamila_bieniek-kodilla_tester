package com.kodilla.bank.homework;

public class Bank {

    private CashMachine[] cashMachine;
    private int size;

    public Bank() {
        this.cashMachine = new CashMachine[0];
        this.size = 0;
    }

    public void addCashMachine(CashMachine cash) {
        this.size++;
        CashMachine[] newTab = new CashMachine[this.size];
        System.arraycopy(cashMachine, 0, newTab, 0, cashMachine.length);
        newTab[this.size - 1] = cash;
        this.cashMachine = newTab;
    }

    public int balance() {
        int balance = 0;
        for (int i = 0; i < cashMachine.length; i++) {
            balance += cashMachine[i].getAccountBalance();
        }
        return balance;
    }

    public int negativeCountOfTransactions() {
        int count = 0;
        for (int i = 0; i < cashMachine.length; i++) {
            count += cashMachine[i].negativeTransactions();
        }
        return count;
    }

    public int positiveCountOfTransactions() {
        int count = 0;
        for (int i = 0; i < cashMachine.length; i++) {
            count += cashMachine[i].positiveTransactions();
        }
        return count;

    }
        public double getAverageNegativeTransactions () {
            int sum = 0;
            for (int i = 0; i < cashMachine.length; i++) {
                sum += cashMachine[i].sumNegativeTransactions();
            }
            double count = negativeCountOfTransactions();
            return sum/count;
        }

    public double getAveragePositiveTransactions () {
        int sum = 0;
        for (int i = 0; i < cashMachine.length; i++) {
            sum += cashMachine[i].sumPositiveTransactions();
        }
        double count = positiveCountOfTransactions();
        return sum/count;
    }



    }
