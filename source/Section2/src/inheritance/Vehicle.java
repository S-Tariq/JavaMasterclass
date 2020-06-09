package inheritance;

// Challenge given:
// Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
// Finally, create another class, a specific type of Car that inherits from the Car class.
// You should be able to handle steering, changing gears, and moving (speed in other words).
// You will want to decide where to put the appropriate state and behaviours (fields and methods).
// As mentioned above, changing gears, increasing/decreasing speed should be included.
// For your specific type of vehicle you will want to add something specific for that type of car.

public class Vehicle {

    private String name;
    private String colour;
    private String size;
    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String colour, String size) {
        this.name = name;
        this.colour = colour;
        this.size = size;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("Vehicle.steer() called. Vehicle steers at " + direction + " degrees.");
    }

    public void move(int velocity, int direction){
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle.move() called. Vehicle is moving at " + currentVelocity +
                " in direction " + currentDirection);
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void stop(){
        this.currentVelocity = 0;
    }
}
