package com.kodilla.bank.homework;

public class Bank {

private CashMachine minusCash;
private CashMachine plusCash;

public Bank (){
    this.minusCash = new CashMachine();
    this.plusCash = new CashMachine();
}

public void addMinusCash(int cash){
    if(cash<0){
        this.minusCash.bank(cash);
    }
}

public void addPlusCash(int cash){
    if(cash>0){
        this.plusCash.bank(cash);
    }
}

public double getMinusCashBalance(){
    return this.minusCash.getAccountBalance();
}

public double getPlusCashBalance(){
    return this.plusCash.getAccountBalance();
}

public double getAverage(){
    double sum = this.minusCash.getAccountBalance() + this.plusCash.getAccountBalance();
    return sum/2;
}


}
