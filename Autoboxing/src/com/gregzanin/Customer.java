package com.gregzanin;

import java.util.ArrayList;

/**
 * Created by GR389658 on 28/09/2017.
 */
public class Customer {
    private String name;
    private ArrayList<Double> transactionList = new ArrayList<Double>();

    public Customer(String name, Double firstTransaction) {
        this.name = name;
        transactionList.add(firstTransaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactionList() {
        return transactionList;
    }


}
