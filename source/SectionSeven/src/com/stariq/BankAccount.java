package com.stariq;

// Challenge given:
// Create a new class for a bank account.
// Create fields for the account number, balance, customer name, email and phone number.
// Create getters and setters for each field.
// Create two additional methods.
// 1. To allow the customer to deposit funds (this should increment the balance field).
// 2. To allow the customer to withdraw funds (this should deduct from the balance field).
// Do not allow the withdrawal to complete if there are insufficient funds.
// You will want to create various code in the Main class (the one created by IntelliJ) to
// confirm your code is working.
// Add some System.out.println's in the two methods above as well.

public class BankAccount {

    private String accountNo;
    private String name;
    private String email;
    private String phoneNo;
    private double balance;

    public BankAccount() {
        this("12", "Dan", "dan12@email", "07235", 500);
        printDetails();
        System.out.println("\nConstructor without parameters");
    }

    public BankAccount(String accountNo, String name, String email, String phoneNo, double balance){
        System.out.println("\nConstructor with parameters");
        this.accountNo = accountNo;
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
        this.balance = balance;
    }

    public BankAccount(String name, String email, String phoneNo) {
        this("01", name, email, phoneNo, 10);
    }

    public void setAccountNo(String accountNo){
        this.accountNo = accountNo;
    }

    public String getAccountNo(){
        return accountNo;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    public void setPhoneNo(String phoneNo){
        this.phoneNo = phoneNo;
    }

    public String getPhoneNo(){
        return phoneNo;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void depositFunds(double deposit){
        balance += deposit;
        System.out.println("Deposit was successful for account number: " + accountNo +
                ". New balance is: " + balance);
    }

    public void withdrawFunds(double withdraw) {
        if ((balance - withdraw) >= 0) {
            balance -= withdraw;
            System.out.println("Withdrawal was successful for account number: " + accountNo +
                    ". New balance is: " + balance);
        } else {
            System.out.println("Withdrawal was not successful due to insufficient funds");
        }
    }

    public void printDetails(){
        System.out.println("Account number: " + accountNo);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone number: " + phoneNo);
        System.out.println("Balance: " + balance);
    }
}
