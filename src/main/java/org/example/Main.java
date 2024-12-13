package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.setAccountNumber("00026200100069501");
        account1.setAccountName("MAYB Madurapperuma");
        account1.setBalance(100000);
        account1.setEmail("ybimsara03@gmail.com");
        account1.setContactNumber("0767329685");

        printAccountDetails(account1);

        account1.depositMoney(12000);

    }

    public static void printAccountDetails(BankAccount account1) {
        System.out.println(account1.getAccount_number());
        System.out.println(account1.getAccount_name());
        System.out.println(account1.getBalance());
        System.out.println(account1.getEmail());
        System.out.println(account1.getContact_number());
    }

}