package org.example;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);

        String accNumber;
        String accName;
        double accBalance;
        String accEmail;
        String accContact;
        char withdrawOrDeposti;

        System.out.println("Welcome to Bank Manager");
        System.out.println("Please enter your account number: ");
        accNumber = myscanner.nextLine();
        System.out.println("Please enter your account name: ");
        accName = myscanner.nextLine();
//        System.out.println("Please enter your balance: ");
//        accBalance = myscanner.nextDouble();
        System.out.println("Please enter your account email: ");
        accEmail = myscanner.nextLine();
        System.out.println("Please enter your account contact: ");
        accContact = myscanner.nextLine();

        System.out.println("Do you wish to withdraw or deposit money? Enter 'w' for withdraw and 'd' for deposit.");
        withdrawOrDeposti = myscanner.next().charAt(0);

        try {
            switch (withdrawOrDeposti) {
                case 'w':System.out.println("Your want to withdraw");
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

        BankAccount account1 = new BankAccount("00026200100069501",
                                                "MAYB Madurapperuma",
                                                100000,
                                                "ybimsara03@gmail.com",
                                                "076732968");

        printAccountDetails(account1);

        account1.depositMoney(12000);
        account1.withdrawMoney(500000);
        account1.withdrawMoney(10000);

    }

    public static void printAccountDetails(BankAccount account1) {
        System.out.println(account1.getAccount_number());
        System.out.println(account1.getAccount_name());
        System.out.println(account1.getBalance());
        System.out.println(account1.getEmail());
        System.out.println(account1.getContact_number());
    }

}