package com.modernjava.java9.privatemethods;

/**
 * @author kansanja on 16/02/24.
 */
public class BankTest {
    public static void main(String[] args) {
        Bank bank = new SavingsAccount(1000);

        bank.executeTransaction("DEPOSIT", 100);
        bank.executeTransaction("WITHDRAW", 1200);
        System.out.println("Final Balance :" + bank.getBalance());
    }
}
