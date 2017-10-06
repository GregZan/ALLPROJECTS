package com.gregzanin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank(2,"Itaú");

        bank.addBranch(31);

        bank.getBranchList().get(bank.findBranchById(31)).addCustomer("Greg", 50.60);
        bank.getBranchList().get(bank.findBranchById(31)).addCustomer("Cris", 80.90);
        bank.getBranchList().get(bank.findBranchById(31)).addCustomer("Régius", 29.97);

        bank.addBranch(27);
        bank.getBranchList().get(bank.findBranchById(27)).addCustomer("Bob", 49.99);

        bank.getBranchList().get(bank.findBranchById(31)).addTransactions(bank.getBranchList().get(bank.findBranchById(31))
                .findCustomer("Greg"), 67.95);
        bank.getBranchList().get(bank.findBranchById(31)).addTransactions(bank.getBranchList().get(bank.findBranchById(31))
                .findCustomer("Greg"), 12.44);
        bank.getBranchList().get(bank.findBranchById(31)).addTransactions(bank.getBranchList().get(bank.findBranchById(31))
                .findCustomer("Cris"), 69.96);

        bank.showCustomerList(bank.findBranchById(31));
        bank.showCustomerTransactions(bank.findBranchById(31), bank.getBranchList().get(bank.findBranchById(31))
                .findCustomer("greg"));
        bank.showCustomerTransactions(bank.findBranchById(31), bank.getBranchList().get(bank.findBranchById(31))
                .findCustomer("cris"));
        bank.showCustomerTransactions(bank.findBranchById(31), bank.getBranchList().get(bank.findBranchById(31))
                .findCustomer("Régius"));

        bank.showCustomerList(bank.findBranchById(27));
        bank.showCustomerTransactions(bank.findBranchById(27), bank.getBranchList().get(bank.findBranchById(27))
                .findCustomer("Bob"));


    }

}
