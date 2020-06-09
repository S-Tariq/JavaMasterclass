package arraylist;

// Challenge given:
// Create a program that implements a simple mobile phone with the following capabilities.
// Able to store, modify, remove and query contact names.
// You will want to create a separate class for Contacts (name and phone number).
// Create a master class (MobilePhone) that holds the ArrayList of Contacts.
// The MobilePhone class has the functionality listed above.
// Add a menu of options that are available.
// Options: quit, print list of contacts, add new contact, update existing contact, remove contact
// and search/find contact.
// When adding or updating be sure to check if the contact already exists (use name).
// Be sure not to expose the inner workings of the Arraylist to MobilePhone
// e.g. no ints, no .get(i) etc.
// MobilePhone should do everything with Contact objects only.

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contact> contactList = new ArrayList<Contact>();

    public ArrayList<Contact> getContactList() {
        return contactList;
    }

    public void printContactList(){
        System.out.println("You have " + contactList.size() + " contacts on your mobile phone.");
        for(int i = 0; i < contactList.size(); i++){
            System.out.println((i + 1) + ". " + contactList.get(i).getName() +
                    " -> " + contactList.get(i).getPhoneNo());
        }
    }

    public boolean addMobileContact(Contact contact){
        if(findContact(contact.getName()) >= 0){
            System.out.println("Contact already exists.");
            return false;
        } else {
            contactList.add(contact);
            return true;
        }
    }

    public boolean updateMobileContact(Contact oldContact, Contact newContact) {
        int position = findContact(oldContact);
        if (position < 0) {
            System.out.println("Contact not found.");
            return false;
        } else if(findContact(newContact.getName()) != -1){
            System.out.println("Contact already exists.");
            return false;
        } else {
            updateMobileContact(position, newContact);
            System.out.println("Contact modified.");
            return true;
        }
    }

    private void updateMobileContact(int position, Contact contact){
        contactList.set(position,contact);
    }

    public boolean removeMobileContact(Contact contact){
        int position = findContact(contact);
        if(position >= 0){
            removeMobileContact(position);
            System.out.println("Contact removed.");
            return true;
        } else {
            System.out.println("Contact not found.");
            return false;
        }
    }

    private void removeMobileContact(int position){
        contactList.remove(position);
    }

    public boolean queryMobileContact(Contact contact){
        int position = findContact(contact);
        if(position >= 0){
            return true;
        } else {
            return false;
        }
    }

    public Contact queryMobileContact(String name){
        int position = findContact(name);
        if(position >= 0){
            return contactList.get(position);
        }
        return null;
    }

    private int findContact(Contact contact){
        return contactList.indexOf(contact);
    }

    private int findContact(String contactName){
        for(int i = 0; i < contactList.size(); i++){
            Contact contact = contactList.get(i);
            if(contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }
}
