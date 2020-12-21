package com.company;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    //create a constructor that takes two parameters, name and initial amount

    public Customer(String name, double intialAmount) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransactions(intialAmount);
    }

    public void addTransactions(double amount){
        this.transactions.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
