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
        accountOne.setAccountNo("28");
        accountOne.setName("Emma");
        accountOne.setEmail("emma16@email");
        accountOne.setPhoneNo("07711");
        accountOne.setBalance(100);
        accountOne.printDetails();

        // Uses constructor with all parameters.
        BankAccount accountTwo = new BankAccount("34", "Harry",
                "harry10@email", "07123", 200);
        accountTwo.printDetails();

        // Uses constructor with some parameters.
        BankAccount accountThree = new BankAccount("Ben","ben45@email","07859");
        accountThree.printDetails();

        // Creates transactions.
        System.out.println("\nTransaction details: ");
        accountOne.withdrawFunds(50);
        accountOne.depositFunds(20);
        accountTwo.depositFunds(100);
        accountTwo.withdrawFunds(70);
        accountThree.depositFunds(120);
    }
}
