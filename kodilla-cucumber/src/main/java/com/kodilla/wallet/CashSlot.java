package com.kodilla.wallet;

public class CashSlot {
    private int contents;
    private String errorMessage;

    public int getContents() {
        return contents;
    }

    public void dispense(int amount) {
        this.contents = amount;
    }
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }



}