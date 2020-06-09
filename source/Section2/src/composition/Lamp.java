package composition;

public class Lamp {

    private String style;
    private boolean battery;
    private int rating;

    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.rating = globRating;
    }

    public void turnOn(){
        System.out.println("Lamp.turnOn() called.");
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getRating() {
        return rating;
    }
}
