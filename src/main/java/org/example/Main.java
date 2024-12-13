package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("00026200100069501",
                                                "MAYB Madurapperuma",
                                                100000,
                                                "ybimsara03@gmail.com",
                                                "0767329685");

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