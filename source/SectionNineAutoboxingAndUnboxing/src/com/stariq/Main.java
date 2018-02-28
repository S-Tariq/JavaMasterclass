package com.stariq;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        addIntClass();
        addBank();
    }

    public static void addBank(){

        System.out.println("\n*****");

        Bank bank = new Bank("National Bank");

        // Adding customer for London branch.
        bank.addBranch("London");
        bank.addCustomer("London","Sam", 90.50);
        bank.addCustomer("London", "Anne", 45.23);
        bank.addCustomer("London", "Emma", 78.12);

        // Adding customer for Liverpool branch.
        bank.addBranch("Liverpool");
        bank.addCustomer("Liverpool", "Joe", 4578.09);
        bank.addCustomer("Liverpool", "Tom", 57.0);
        bank.addCustomer("Liverpool", "Megan", 98.0);

        // Adding transactions for London branch.
        bank.addTransaction("London", "Sam", 90.78);
        bank.addTransaction("London", "Emma", 12.4);
        bank.addTransaction("London", "Anne", 87.9);

        // Adding transactions for Liverpool branch.
        bank.addTransaction("Liverpool", "Joe", 45.2);
        bank.addTransaction("Liverpool", "Megan", 80.23);

        // Showing transactions.
        bank.listCustomer("London", true);
        bank.listCustomer("Liverpool", true);

        // Testing validation.
        bank.addBranch("Manchester");
        if(!bank.addCustomer("Manchester","Rob", 45.67)){
            System.out.println("Branch does not exist.");
        }

        if(!bank.addBranch("Manchester")){
            System.out.println("Branch already exists.");
        }

        if(!bank.addTransaction("Liverpool", "Kyle", 90.8)){
            System.out.println("Customer does not exist.");
        }

        if(!bank.addCustomer("London", "Emma", 52.0)){
            System.out.println("Customer already exists.");
        }
    }

    public static void addIntClass(){

        System.out.println("\n*****");

        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Sam");

        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(16));

        Integer integer = new Integer(12);
        Double doubleValue = new Double(12.12);

        System.out.println("\nInteger: ");

        // Autoboxing
        ArrayList<Integer> myIntValues = new ArrayList<Integer>();
        for(int i = 0; i <= 10; i++){
            myIntValues.add(Integer.valueOf(i));
        }
        // Unboxing
        for(int i = 0; i <= 10; i++){
            int value = myIntValues.get(i).intValue();
            System.out.println(i + " -> " + value);
        }

        Integer myIntValue = 16; // Integer.valueOf(16);
        int myInt = myIntValue; // myIntValue.intValue();

        System.out.println("\nDouble: ");

        // Autoboxing
        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for(double i = 0.0; i <= 10.0; i+= 0.5){
            myDoubleValues.add(Double.valueOf(i));
        }
        // Unboxing
        for(int i = 0; i < myDoubleValues.size(); i++){
            double value = myDoubleValues.get(i).doubleValue();
            System.out.println(i + " -> " + value);
        }
    }
}

class IntClass{
    private int myValue;

    public IntClass(int myValue){
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}