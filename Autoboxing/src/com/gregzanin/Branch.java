package com.gregzanin;

import java.util.ArrayList;

/**
 * Created by GR389658 on 28/09/2017.
 */
public class Branch {
    private int id;
    private ArrayList<Customer> customerList = new ArrayList<Customer>();

    public void addCustomer (String name, Double firstTransaction){
        this.customerList.add(new Customer(name, firstTransaction));
    }


    public void addTransactions (int customer, Double transaction) {
        this.customerList.get(customer).getTransactionList().add(transaction);
    }

    public Branch(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public int findCustomer (String name){
        for(Customer object: customerList){
            if(object.getName().equalsIgnoreCase(name)){
                return customerList.indexOf(object);
            }
        }
        return -1;

    }




}
