package com.cbfacademy.accounts;

public class SavingsAccount extends Account {
    public double interestRate;

    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void applyInterest(double rate) {
        interestRate = rate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate() {
        
    }
}
