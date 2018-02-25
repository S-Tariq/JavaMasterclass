package com.stariq;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {
        addGroceryList();
        addMobilePhone();
    }

    public static void addMobilePhone(){

        System.out.println("\n*****");

        boolean quit = false;
        int choice;
        printOptions();

        while(!quit){
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 0:
                    printOptions();
                    break;
                case 1:
                    mobilePhone.printContactList();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    quit = true;
                    break;
                default:
                    System.out.println("Please enter correct option");
                    break;
            }
        }
    }

    public static void printOptions(){
        System.out.println("\nOptions: ");
        System.out.println("\t 0 - Choices.");
        System.out.println("\t 1 - Print contacts.");
        System.out.println("\t 2 - Add new contact.");
        System.out.println("\t 3 - Update existing contact.");
        System.out.println("\t 4 - Remove contact.");
        System.out.println("\t 5 - Search contact.");
        System.out.println("\t 6 - Quit.");
    }

    public static void addContact(){
        System.out.println("Enter contact to add: ");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Phone number: ");
        String phoneNo = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phoneNo);
        if(mobilePhone.addMobileContact(newContact)){
            System.out.println("New contact added.");
        } else {
            System.out.println("New contact not added.");
        }
    }

    public static void updateContact(){
        System.out.println("Enter old contact: ");
        System.out.print("Name: ");
        String oldName = scanner.nextLine();
//        System.out.print("Phone number: ");
//        String oldPhoneNo = scanner.nextLine();
        Contact oldContact = mobilePhone.queryMobileContact(oldName);
        if(oldContact == null){
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("Enter new contact: ");
        System.out.print("Name: ");
        String newName = scanner.nextLine();
        System.out.print("Phone number: ");
        String newPhoneNo = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newPhoneNo);
        boolean updated = mobilePhone.updateMobileContact(oldContact,newContact);
        if(updated){
            System.out.println("Successfully updated.");
        } else {
            System.out.println("Error: Not updated.");
        }
    }

    public static void removeContact(){
        System.out.println("Enter contact to remove: ");
        System.out.print("Name: ");
        String name = scanner.nextLine();
//        System.out.print("Phone number: ");
//        String phoneNo = scanner.nextLine();
        Contact contact = mobilePhone.queryMobileContact(name);
        if(contact == null){
            System.out.println("Contact not found.");
            return;
        }
        boolean removed = mobilePhone.removeMobileContact(contact);
        if(removed){
            System.out.println("Successfully removed.");
        } else {
            System.out.println("Error: Not removed.");
        }
    }

    public static void queryContact(){
        System.out.println("Enter contact to search: ");
        System.out.print("Name: ");
        String name = scanner.nextLine();
//        System.out.print("Phone number: ");
//        String phoneNo = scanner.nextLine();
        Contact contact = mobilePhone.queryMobileContact(name);
        if(contact == null){
            System.out.println("Contact not found.");
            return;
        }
        boolean found = mobilePhone.queryMobileContact(contact);
        if(found){
            System.out.println("Successfully found.");
            System.out.println("Name: " + contact.getName() +
                    " and Phone number: " + contact.getPhoneNo());
        } else {
            System.out.println("Error: Not found.");
        }
    }

    public static void addGroceryList(){

        System.out.println("\n*****");

        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
                default:
                    System.out.println("Enter correct choice.");
                    break;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("\nMain Options: ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addItem(){
        System.out.print("Enter item to add: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.print("Enter old item: ");
        String oldItem = scanner.nextLine();
        System.out.print("Enter new item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(oldItem, newItem);
    }

    public static void removeItem(){
        System.out.print("Enter item to remove: ");
        String item = scanner.nextLine();
        groceryList.removeGroceryItem(item);
    }

    public static void searchForItem(){
        System.out.print("Enter item to search: ");
        String searchItem = scanner.nextLine();
        if(groceryList.onList(searchItem)){
            System.out.println("Found: " + searchItem);
        } else {
            System.out.println("Not found: " + searchItem);
        }
    }

    public static void processArrayList(){
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }
}
