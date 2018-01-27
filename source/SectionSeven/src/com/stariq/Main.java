package com.stariq;

public class Main {

    public static void main(String[] args) {
        addCars();
        addBankAccounts();
    }

    // Experimenting with Car class.
    public static void addCars(){

        System.out.println("\n*****");

        // Instantiates class.
        Car porsche = new Car();
        Car holden = new Car();

        // Adds car details.
        System.out.println("\nCar details: ");
        porsche.setModel("Carrera");
        holden.setModel("911");
        System.out.println("Model is " + porsche.getModel());
        System.out.println("Model is " + holden.getModel());
    }

    // Experimenting with BankAccount class.
    public static void addBankAccounts(){

        System.out.println("\n*****");

        // Adds details to bank accounts.
        System.out.println("\nAccount details: ");

        // Uses constructor without parameters.
        BankAccount accountOne = new BankAccount();
        accountOne.setAccountNo("1001");
        accountOne.setName("Emma");
        accountOne.setEmail("emma16@hotmail");
        accountOne.setPhoneNo("07711");
        accountOne.setBalance(100);
        accountOne.printDetails();

        // Uses constructor with parameters.
        BankAccount accountTwo = new BankAccount("1234", "Harry",
                "harry10@hotmail", "07123", 200);
        accountTwo.printDetails();

        // Creates transactions for accountOne and accountTwo.
        System.out.println("\nTransaction details: ");
        accountOne.withdrawFunds(50);
        accountOne.depositFunds(20);
        accountTwo.depositFunds(100);
        accountTwo.withdrawFunds(70);
    }
}
