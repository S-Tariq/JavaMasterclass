package com.stariq;

import java.util.ArrayList;

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

        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(4);
        intList.add(5);
        intList.add(3);

        for(int i = 0; i < intList.size(); i++){
            System.out.println(i + ": " + intList.get(i));
        }

        intList.add(1,2);

        for(int i = 0; i < intList.size(); i++){
            System.out.println(i + ": " + intList.get(i));
        }
    }
}
