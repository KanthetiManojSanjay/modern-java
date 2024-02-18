package com.modernjava.java9.privatemethods;

/**
 * @author kansanja on 16/02/24.
 */
public interface Bank {
    double getBalance();

    void deposit(double amount);

    void withdraw(double amount);

    default void executeTransaction(String type, double amount) {
        if (type.equals("DEPOSIT")) {
            deposit(amount);
            logTransaction(type, amount);
        } else if (type.equals("WITHDRAW") && sufficientBalance(amount)) {
            withdraw(amount);
            logTransaction(type, amount);
        } else {
            System.out.println("Transaction failed. Insufficient funds!!");
        }
    }

    private void logTransaction(String type, double amount) {
        System.out.println("Transaction type :" + type);
        System.out.println("Amount :" + amount);
        System.out.println("Current Balance :" + getBalance());
    }

    // private methods are introduced in java9
    private boolean sufficientBalance(double amount) {
        return getBalance() >= amount;
    }
}
