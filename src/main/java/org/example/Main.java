package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);



        String accNumber;
        String accName = "MAYB MADURAPPERUMA";
        double accBalance = 100000;
        String accEmail = "ybimsara03@gmail.com";
        String accContact = "0767329685";
        char withdrawOrDeposit;
        String pin = "0000";

        System.out.println("Welcome to Bank Manager");
        System.out.println("Please enter your account number: ");
        accNumber = myscanner.nextLine();
        System.out.println("Please enter your pin: ");
        pin = myscanner.nextLine();


        System.out.println("Your balance is: " + accBalance);

        System.out.println("Do you wish to withdraw or deposit money? Enter 'w' for withdraw and 'd' for deposit.");
        withdrawOrDeposit = myscanner.next().charAt(0);

        try {
            switch (withdrawOrDeposit) {
                case 'w':System.out.println("Your want to withdraw");
                    int withdraw_amount = withdrawAmount(accBalance);
                    BankAccount account1 = new BankAccount(accNumber,   accName, accBalance - withdraw_amount, accEmail, accContact);
                    printAccountDetails(account1);
                    System.out.println("Withdrawal of Rs." + withdraw_amount + " made." +
                            " Your account balance is: " + account1.getBalance());
                    return;
                case 'd':System.out.println("Your want to deposit");
                    int deposit_amount = depositAmount(accBalance);
                    BankAccount account2 = new BankAccount(accNumber, accName, accBalance + deposit_amount, accEmail, accContact);
                    printAccountDetails(account2);
                    System.out.println("Deposit of Rs." + deposit_amount + " made." +
                            " Your account balance is: " + account2.getBalance());
                    return;
                default:
                    System.out.println("Invalid withdraw or denomination");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Invalid withdraw or denomination");
        }

    }

    public static int withdrawAmount(double accBalance) {
        Scanner myscanner = new Scanner(System.in);
        System.out.println("Enter amount to withdraw: ");
        int amount = myscanner.nextInt();
        return amount;

    }

    public static int depositAmount(double accBalance) {
        Scanner myscanner = new Scanner(System.in);
        System.out.println("Enter amount to withdraw: ");
        int amount = myscanner.nextInt();
        return amount;

    }

    public static void printAccountDetails(BankAccount account1) {
        System.out.println( "BANK STATEMENT" +
                            "----------------" +
                            "Account Name : " + account1.getAccount_name() + "\n" +
                            "Account Number : " + account1.getAccount_number() + "\n" +
                            "Email : " + account1.getEmail() + "\n" +
                            "Contact Number : " + account1.getContact_number() + "\n" +
                            "-----------");

    }

}