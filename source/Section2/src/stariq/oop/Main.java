package stariq.oop;

public class Main {

    public static void main(String[] args) {

        // Adds details to Hamburger class.
        System.out.println("\n*****");
        Hamburger hamburger = new Hamburger("Basic", "White", "Chicken", 3.50);
        hamburger.addHamburgerAdditionOne("Tomato", 0.75);
        hamburger.addHamburgerAdditionTwo("Cheese", 0.5);
        hamburger.addHamburgerAdditionThree("Lettuce", 0.84);
        hamburger.addHamburgerAdditionFour("Carrot", 0.26);
        System.out.println("Total price: £" + hamburger.totalHamburger());

        // Adds details to HealthyBurger class.
        System.out.println("\n*****");
        HealthyBurger healthyBurger = new HealthyBurger("Beef", 4.25);
        healthyBurger.addHealthyBurgerAdditionOne("Eggs", 1.25);
        healthyBurger.addHealthyBurgerAdditionTwo("Cress", 0.10);
        healthyBurger.addHamburgerAdditionOne("Tomato", 0.75);
        System.out.println("Total price: £" + healthyBurger.totalHamburger());

        // Adds details to DeluxeBurger class.
        System.out.println("\n*****");
        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamburgerAdditionOne("Cheese",0.5);
        System.out.println("Total price: £" + deluxeBurger.totalHamburger());
    }
}
