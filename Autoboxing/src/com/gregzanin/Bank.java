package com.gregzanin;

import java.util.ArrayList;

/**
 * Created by GR389658 on 28/09/2017.
 */
public class Bank {
    private ArrayList<Branch> branchList = new ArrayList<Branch>();
    private String name;

    public Bank(int id, String name) {
        this.branchList.add(new Branch(id));
        this.name = name;
    }

    public void addBranch(int id) {
        this.branchList.add(new Branch(id));
    }



    public void showCustomerList(int position){
        for (Customer object: branchList.get(position).getCustomerList()) {
            System.out.println("nº: " + (branchList.get(position).getCustomerList().indexOf(object) + 1) + " - Customer: " + object.getName());
        }
        System.out.println("***********************************************");
    }


    public int findBranchById(int id){
        for(Branch object: branchList){
            if(object.getId() == id){
                return branchList.indexOf(object);
            }
        }

        return -1;
    }

    public void showCustomerTransactions(int positionBranch, int positionCustomer){
        System.out.println("Customer: " + branchList.get(positionBranch).getCustomerList().get(positionCustomer).getName() + "  -  Number of transactions: " + branchList.get(positionBranch).getCustomerList().get(positionCustomer).getTransactionList().size());
        for (Double object: branchList.get(positionBranch).getCustomerList().get(positionCustomer).getTransactionList()){
            System.out.println("Transaction nº: " + (branchList.get(positionBranch).getCustomerList().get(positionCustomer).getTransactionList().indexOf(object) + 1) + " - transaction value: " + branchList.get(positionBranch).getCustomerList().get(positionCustomer).getTransactionList().get(branchList.get(positionBranch).getCustomerList().get(positionCustomer).getTransactionList().indexOf(object)));

        }
        System.out.println("***********************************************");
    }

    public ArrayList<Branch> getBranchList() {
        return branchList;
    }

    public String getName() {
        return name;
    }


}
