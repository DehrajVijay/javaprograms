package com.applications;



class BankAccount {
    String accountHolderName;
    String accountNumber;
    double balance;

    // Constructor to initialize account details
    BankAccount(String name, String number, double initialBalance) {
        this.accountHolderName = name;
        this.accountNumber = number;
        this.balance = initialBalance;
    }

    void displayDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

public class Bank {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("John Doe", "123456789", 1000.0);
        BankAccount account2 = new BankAccount("John 2", "123456666", 10656500.0);
        account.displayDetails();
        account2.displayDetails();
    
    
    }
}

