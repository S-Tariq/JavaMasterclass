package com.stariq;

public class DeluxeBurger extends Hamburger{

    public DeluxeBurger() {
        super("Deluxe", "White", "Chicken & Beef",4.50);
        super.addHamburgerAdditionOne("Chips",1.50);
        super.addHamburgerAdditionTwo("Drink", 2.20);
    }

    @Override
    public void addHamburgerAdditionOne(String name, double price) {
        System.out.println("Cannot add additional items.");
    }

    @Override
    public void addHamburgerAdditionTwo(String name, double price) {
        System.out.println("Cannot add additional items.");
    }

    @Override
    public void addHamburgerAdditionThree(String name, double price) {
        System.out.println("Cannot add additional items.");
    }

    @Override
    public void addHamburgerAdditionFour(String name, double price) {
        System.out.println("Cannot add additional items.");
    }
}
