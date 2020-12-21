package com.company;

import java.util.ArrayList;

public class Bank {
    private String bankName;
    //bank has multiple branches
    //create Arraylist for branches
    private ArrayList<Branch> branches;

    public Bank(String bankName) {
        this.bankName = bankName;
        //initialise branch
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName){
        if (findBranch(branchName) == null){
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount){
        Branch branch = findBranch(branchName);
        if (branch != null){
            return branch.newCustomer(customerName,initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount){
        //check to see if branch exist
        Branch branch = findBranch(branchName);
        if (branch != null){
            return branch.addCustomerTransaction(customerName,amount);
        }
        return false;
    }

    private Branch findBranch(String branchName){
        //create for loop to look for branch

        for (int i = 0; i < this.branches.size(); i++){
            Branch checkedBranch = this.branches.get(i);
            if (checkedBranch.getName().equals(branchName)){
                return checkedBranch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransactions){
        Branch branch = findBranch(branchName);
        if (branch != null){
            System.out.println("Customers for branch: " + branch.getName());
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for ( int i = 0; i < branchCustomers.size(); i++ ){
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customers: " + branchCustomer.getName() + "[" + (i+1) + "]");
                if (showTransactions){
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++){
                        System.out.println("[" + (j+1) + "] amount " +transactions.get(j));
                    }
                }
            }
            return true;
        } else {
            return false;
        }

    }
}
