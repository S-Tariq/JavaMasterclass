package com.stariq;

public class Main {

    public static void main(String[] args) {
        addCustomer();
    }

    public static void addCustomer(){

        System.out.println("\n******");

        Customer customer = new Customer("Sam", 56);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(45);
        System.out.println("Balance for customer " + customer.getName() +
                " is " + customer.getBalance());
        
    }
}
