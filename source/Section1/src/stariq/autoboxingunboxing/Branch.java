package stariq.autoboxingunboxing;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers = new ArrayList<Customer>();

    public Branch(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean addCustomer(String name, double initialTransaction){
        if(findCustomer(name) == null){
            customers.add(new Customer(name, initialTransaction));
            return true;
        } else {
            return false;
        }
    }

    public boolean addTransaction(String name, double amount){
        Customer customer = findCustomer(name);
        if(customer != null){
            customer.addTransaction(amount);
            return true;
        } else {
            return false;
        }
    }

    private Customer findCustomer(String name){
        for(int i = 0; i < customers.size(); i++) {
            Customer customer = customers.get(i);
            if (customer.getName().equals(name)) {
                return customer;
            }
        }
        return null;
    }
}
