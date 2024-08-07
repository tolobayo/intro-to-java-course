package com.cbfacademy.accounts;

public class Account {
    public int accountNumber;
    public double balance;

    Account(
        int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public double deposit(double amount) {
        balance += amount;
        return balance;
    }
    public double withdraw(double requested) {
        
        if (requested <= 0 || balance < requested) {
            return 0.0;
        }
        else {
            balance -= requested;
            return requested;
        }
    }
}
