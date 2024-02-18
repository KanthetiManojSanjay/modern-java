package com.modernjava.java9.privatemethods;

/**
 * @author kansanja on 16/02/24.
 */
public class SavingsAccount implements Bank {

    private double balance;

    public SavingsAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }
}
