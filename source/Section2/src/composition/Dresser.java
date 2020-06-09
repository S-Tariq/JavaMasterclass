package composition;

public class Dresser {

    private int drawers;
    private String colour;

    public Dresser(int drawers, String colour) {
        this.drawers = drawers;
        this.colour = colour;
    }

    public void shutDrawers(){
        System.out.println("Dresser.shutDrawers() called.");
    }

    public int getDrawers() {
        return drawers;
    }

    public String getColour() {
        return colour;
    }
}
