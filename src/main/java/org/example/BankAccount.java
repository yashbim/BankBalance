package org.example;

public class BankAccount {
    private String account_number;
    private double balance;
    private String account_name;
    private String email;
    private String contact_number;

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

    //setter
    public void setAccountNumber(String accNum) {
        this.account_number = accNum;
    }
    public void setBalance(double accBal) {
        this.balance = accBal;
    }
    public void setAccountName(String accName) {
        this.account_name = accName;
    }
    public void setEmail(String accEmail) {
        this.email = accEmail;
    }
    public void setContactNumber(String accContact) {
        this.contact_number = accContact;
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
