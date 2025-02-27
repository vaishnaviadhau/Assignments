package org.example;

public class Account {
    int accountNumber;
    private int balance;
    private int pin;
    String accountHolder;

    public Account(String accountHolder,int pin)
    {
        this.accountHolder=accountHolder;
        this.pin=pin;
    }


    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
}
