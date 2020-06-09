package composition;

public class Ceiling {

    private int height;
    private String colour;

    public Ceiling(int height, String colour) {
        this.height = height;
        this.colour = colour;
    }

    public int getHeight() {
        return height;
    }

    public String getColour() {
        return colour;
    }
}
