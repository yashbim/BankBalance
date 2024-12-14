package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);

        String accNumber;
        String accName;
        double accBalance = 100000;
        String accEmail;
        String accContact;
        char withdrawOrDeposti;

        System.out.println("Welcome to Bank Manager");
        System.out.println("Please enter your account number: ");
        accNumber = myscanner.nextLine();
        System.out.println("Please enter your account name: ");
        accName = myscanner.nextLine();
        System.out.println("Please enter your account email: ");
        accEmail = myscanner.nextLine();
        System.out.println("Please enter your account contact: ");
        accContact = myscanner.nextLine();

        System.out.println("Your balance is: " + accBalance);

        System.out.println("Do you wish to withdraw or deposit money? Enter 'w' for withdraw and 'd' for deposit.");
        withdrawOrDeposti = myscanner.next().charAt(0);

        try {
            switch (withdrawOrDeposti) {
                case 'w':System.out.println("Your want to withdraw");
                    int amount = withdrawAmount();
                    BankAccount account1 = new BankAccount(accNumber,   accName, accBalance - amount, accEmail, accContact);
                    break;
                case 'd':System.out.println("Your want to deposit");
                break;
                default:
                    System.out.println("Invalid withdraw or denomination");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Invalid withdraw or denomination");
        }

        BankAccount account1 = new BankAccount(accNumber,   accName, 100000, accEmail, accContact);

        printAccountDetails(account1);

    }
    
    public static int withdrawAmount() {
        Scanner myscanner = new Scanner(System.in);
        System.out.println("Enter amount to withdraw: ");
        int amount = myscanner.nextInt();
        return amount;

    }

    public static void printAccountDetails(BankAccount account1) {
        System.out.println(account1.getAccount_number());
        System.out.println(account1.getAccount_name());
        System.out.println(account1.getBalance());
        System.out.println(account1.getEmail());
        System.out.println(account1.getContact_number());
    }

}