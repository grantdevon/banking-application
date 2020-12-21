package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Bank bank = new Bank("FNB");

        bank.addBranch("branchX");

        bank.addCustomer("branchX", "Grant" , 203984.324);
        bank.addCustomer("branchX", "Devon" , 342.4);
        bank.addCustomer("branchX", "Josua", 23423.324);

        bank.addBranch("BranhY");
        bank.addCustomer("BranchY", "bob" ,10000000.00);

        bank.addCustomerTransaction("branchX", "Grant", 10.00);
        bank.addCustomerTransaction("branchX", "Devon", 120.00);
        bank.addCustomerTransaction("branchX", "Grant", 1220.00);
        bank.addCustomerTransaction("branchX", "Grant", 10.00);

        bank.listCustomers("branchX", true);

    }
}
