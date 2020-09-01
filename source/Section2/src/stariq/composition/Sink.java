package stariq.composition;

public class Sink {

    private String material;
    private String colour;

    public Sink(String material, String colour) {
        this.material = material;
        this.colour = colour;
    }

    public void turnOn(){
        System.out.println("Sink.turnOn() called.");
    }

    public void turnOff(){
        System.out.println("Sink.turnOff() called.");
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }
}
