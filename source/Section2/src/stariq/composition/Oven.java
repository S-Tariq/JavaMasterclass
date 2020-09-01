package stariq.composition;

public class Oven {

    private double temperature;

    public Oven(double temperature) {
        this.temperature = temperature;
    }

    public void increaseHeat(){
        System.out.println("Oven.increaseHeat() called.");
    }

    public double getTemperature() {
        return temperature;
    }
}
