package oop;

public class HealthyBurger extends Hamburger{

    private String healthyAdditionOneName;
    private double healthyAdditionOnePrice;
    private String healthyAdditionTwoName;
    private double healthyAdditionTwoPrice;

    public HealthyBurger(String meat, double price) {
        super("Healthy", "Brown Rye", meat, price);
    }

    public void addHealthyBurgerAdditionOne(String name, double price){
        this.healthyAdditionOneName = name;
        this.healthyAdditionOnePrice = price;
    }

    public void addHealthyBurgerAdditionTwo(String name, double price){
        this.healthyAdditionTwoName = name;
        this.healthyAdditionTwoPrice = price;
    }

    @Override
    public double totalHamburger() {
        double hamburgerPrice = super.totalHamburger();
        if(this.healthyAdditionOneName != null) {
            hamburgerPrice += this.healthyAdditionOnePrice;
            System.out.println("Added " + this.healthyAdditionOneName + " for an extra: £" + this.healthyAdditionOnePrice);
        }
        if(this.healthyAdditionTwoName != null){
            hamburgerPrice += this.healthyAdditionTwoPrice;
            System.out.println("Added " + this.healthyAdditionTwoName + " for an extra: £" + this.healthyAdditionTwoPrice);
        }
        return hamburgerPrice;
    }
}
