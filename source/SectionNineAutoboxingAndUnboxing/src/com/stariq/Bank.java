package com.stariq;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches = new ArrayList<Branch>();

    public Bank(String name) {
        this.name = name;
    }

    public boolean addBranch(String name){
        if(findBranch(name) == null){
            branches.add(new Branch(name));
            return true;
        } else {
            return false;
        }
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction){
        Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.addCustomer(customerName,initialTransaction);
        } else {
            return false;
        }
    }

    public boolean addTransaction(String branchName, String customerName, double amount){
        Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.addTransaction(customerName, amount);
        } else {
            return false;
        }
    }

    private Branch findBranch(String name){
        for(int i = 0; i < branches.size(); i++){
            Branch branch = branches.get(i);
            if(branch.getName().equals(name)){
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomer(String branchName, boolean showTransactions){
        Branch branch = findBranch(branchName);
        if(branch != null){
            System.out.println("\nBranch: " + branch.getName());
            ArrayList<Customer> customers = branch.getCustomers();
            for(int i = 0; i < customers.size(); i++){
                Customer customer = customers.get(i);
                System.out.println("\nCustomer: " + customer.getName() + "[" + i + "]");
                if(showTransactions){
                    System.out.println("Transactions: ");
                    ArrayList<Double> transactions = customer.getTransactions();
                    for(int j = 0; j < transactions.size(); j++){
                        System.out.println("[" + (j+1) + "] Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
