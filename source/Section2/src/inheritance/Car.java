package inheritance;

public class Car extends Vehicle{

    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;

    public Car(String name, String colour, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, colour, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear() called. Car changed to " + this.currentGear + " gear.");
    }

    public void changeVelocity(int speed, int direction){
        System.out.println("Car.changeVelocity() called. Car has velocity " + speed + " direction " + direction);
        move(speed, direction);
    }

    public void decelerate(){
        System.out.println("Car.decelerate() called.");
    }

    @Override
    public void move(int velocity, int direction) {
        System.out.println("Car.move() called.");
        decelerate();
        super.move(velocity, direction);
    }

    public void playStereo(){
        System.out.println("Car.playStereo() called.");
    }
}
