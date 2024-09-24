package Atm.oasis;

import java.util.Scanner;

public class ATMSystem {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATM atm = new ATM();
        int userId = 98238; // Default User ID
        int userPin = 1974; // Default PIN

        // User login
        System.out.print("Enter User ID: ");
        int inputUserId = scanner.nextInt();
        System.out.print("Enter PIN: ");
        int inputPin = scanner.nextInt();

        if (inputUserId == userId && inputPin == userPin) {
            System.out.println("Login successful!");

            while (true) {
                // ATM Menu
                System.out.println("\nATM Menu:");
                System.out.println("1. Transaction History");
                System.out.println("2. Withdraw");
                System.out.println("3. Deposit");
                System.out.println("4. Transfer");
                System.out.println("5. Quit");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        atm.showTransactionHistory();
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        atm.withdraw(withdrawAmount);
                        break;
                    case 3:
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        atm.deposit(depositAmount);
                        break;
                    case 4:
                        System.out.print("Enter amount to transfer: ");
                        double transferAmount = scanner.nextDouble();
                        System.out.print("Enter recipient name: ");
                        String recipient = scanner.next();
                        atm.transfer(transferAmount, recipient);
                        break;
                    case 5:
                        System.out.println("Thank you for using the ATM. Goodbye!");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        } else {
            System.out.println("Invalid User ID or PIN.");
        }
    }

}
