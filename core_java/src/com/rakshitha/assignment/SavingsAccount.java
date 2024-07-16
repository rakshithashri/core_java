package com.rakshitha.assignment;

public class SavingsAccount extends BankAccount {
	private double minimumBalance;

    // Parameterized constructor
    public SavingsAccount(int accountNumber, double balance, double minimumBalance) {
        super(accountNumber, balance);
        this.minimumBalance = minimumBalance;
    }

    // Override the withdraw method to enforce the minimum balance
    @Override
    public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be positive.");
        }
        if (balance - amount < minimumBalance) {
            throw new InsufficientFundsException("Cannot withdraw. Balance would fall below the minimum required balance.");
        }
        balance -= amount;
        System.out.println("Withdrew: " + amount);
    }

    // Method to display the minimum balance
    public void displayMinimumBalance() {
        System.out.println("Minimum balance: " + minimumBalance);
    }
}

