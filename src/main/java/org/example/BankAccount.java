package org.example;

public class BankAccount {
    private String account_number;
    private double balance;
    private String account_name;
    private String email;
    private String contact_number;

    public BankAccount(String account_number, String account_name, double balance, String email, String contact_number) {
        this.account_number = account_number;
        this.account_name = account_name;
        this.balance = balance;
        this.email = email;
        if (contact_number.length() != 10) {
            System.out.println("Contact number must be 10 digits in length.");
        } else {
            this.contact_number = contact_number;
        }
    }

    public void depositMoney(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Account " + this.account_number +
                " was deposited by Rs." + depositAmount +
                ". New balance is Rs." + this.balance);
    }

    public void withdrawMoney(double withdrawAmount){
        if (this.balance < withdrawAmount){
            System.out.println("Insufficient funds. Your current balance is Rs." + this.balance);
        } else {
            this.balance -= withdrawAmount;
            System.out.println("Account " + this.account_number +
                    " was withdrawn by Rs." + withdrawAmount +
                    ". New balance is Rs." + this.balance);
        }
    }

    //Getters
    public String getAccount_number() {
        return account_number;
    }
    public String getAccount_name() {
        return account_name;
    }
    public double getBalance() {
        return balance;
    }
    public String getEmail() {
        return email;
    }
    public String getContact_number() {
        return contact_number;
    }

}
