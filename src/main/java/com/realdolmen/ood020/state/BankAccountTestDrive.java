package com.realdolmen.ood020.state;

/**
 * Created by vdabcursist on 16/08/2017.
 */
public class BankAccountTestDrive {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        System.out.println(bankAccount.getState() + " " + bankAccount.getBalance());
        bankAccount.debit(1000.0);
        System.out.println(bankAccount.getState() + " " + bankAccount.getBalance());
        bankAccount.credit(1500.0);
        System.out.println(bankAccount.getState() + " " + bankAccount.getBalance());
        bankAccount.credit(501.0);
        System.out.println(bankAccount.getState() + " " + bankAccount.getBalance());
        bankAccount.credit(40);
        System.out.println(bankAccount.getState() + " " + bankAccount.getBalance());
        bankAccount.debit(2000.0);
        System.out.println(bankAccount.getState() + " " + bankAccount.getBalance());
        bankAccount.credit(1300.0);
        System.out.println(bankAccount.getState() + " " + bankAccount.getBalance());
        bankAccount.close();
        System.out.println(bankAccount.getState() + " " + bankAccount.getBalance());
    }

}
