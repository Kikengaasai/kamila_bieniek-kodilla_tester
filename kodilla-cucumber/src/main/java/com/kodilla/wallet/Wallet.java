package com.kodilla.wallet;

public class Wallet {
    private int balance = 0;

    public Wallet() {
    }

    public void deposit(int money) {
        this.balance += money;
        if (money >= 0) {
            balance += money;
        } else {
            throw new IllegalArgumentException("Negative amount cannot be deposited");
        }
    }

    public int getBalance() {
        return balance;
    }

    public void debit(int money) {
        this.balance -= money;
    }


}
