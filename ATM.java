package Atm.oasis;

import java.util.ArrayList;
import java.util.Scanner;

public class ATM {
	private double balance;
	private ArrayList<String> transactionHistory;

	public ATM() {
		this.balance = 0.0;
		this.transactionHistory = new ArrayList<>();
	}

	// Method to display transaction history
	public void showTransactionHistory() {
		if (transactionHistory.isEmpty()) {
			System.out.println("No transactions yet.");
		} else {
			System.out.println("Transaction History:");
			for (String transaction : transactionHistory) {
				System.out.println(transaction);
			}
		}
	}

	// Method to withdraw money
	
		 public void withdraw(double amount) {
		        if (amount < 0) {
		            System.out.println("You cannot withdraw a negative amount. Please enter a positive value.");
		        } else if (amount > balance) {
		            System.out.println("Insufficient balance.");
		        } else {
		            balance -= amount;
		            transactionHistory.add("Withdrawn: " + amount);
		            System.out.println("Successfully withdrawn: " + amount);
		        }
	}

	// Method to deposit money
	public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive value.");
        } else {
            balance += amount;
            transactionHistory.add("Deposited: " + amount);
            System.out.println("Successfully deposited: " + amount);
        }
    }
	

	// Method to transfer money
	public void transfer(double amount, String recipient) {
		if (amount > balance) {
			System.out.println("Insufficient balance to Transmit.");
		} else {
			balance -= amount;
			transactionHistory.add("Transferred: " + amount + " to " + recipient);
			System.out.println("Successfully Conveyed: " + amount + " to " + recipient);
		}
	}

	// Method to show balance
	public double getBalance() {
		return balance;
	}

}
