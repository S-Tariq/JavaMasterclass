package com.stariq;

// Challenge given:
// Create a new class VipCustomer.
// It should have 3 fields: name, credit limit, and email address.
// Create 3 constructors
// 1st constructor empty should call the constructor with 3 parameters with default values.
// 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd.
// 3rd constructor should save all fields.
// Create getters only for this using code generation of intellij as setters wont be needed.
// Test and confirm it works.

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String email;

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public VipCustomer(){
        this("Jim", 100, "jim6@email");
    }

    public VipCustomer(String name, double creditLimit){
        this(name, creditLimit, "extra@email");
    }

    public VipCustomer(String name, double creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public void printDetails(){
        System.out.println("Name: " + name);
        System.out.println("Credit limit: " + creditLimit);
        System.out.println("Email: " + email);

    }
}
