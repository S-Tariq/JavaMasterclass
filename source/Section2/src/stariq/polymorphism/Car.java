package stariq.polymorphism;

// Challenge given:
// Create a base class called Car.
// It should have a few fields that would be appropriate for a generic car class like
// engine, cylinders, wheels, etc.
// Constructor should initialize cylinders (number of) and name, and set wheels to 4
// and engine to true. Cylinders and names would be passed parameters.
// Create appropriate getters.
// Create some methods like startEngine, accelerate, and brake.
// Show a message for each in the base class.
// Now create 3 sub classes for your favorite vehicles.
// Override the appropriate methods to demonstrate stariq.polymorphism in use.
// Put all classes in the one java file.

public class Car {

    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String startEngine(){
        return "Starting Car.";
    }

    public String accelerate(){
        return "Accelerating Car.";
    }

    public String brake(){
        return "Braking Car.";
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
}

// Coupe class.
class Coupe extends Car{

    public Coupe(){
        super("Coupe", 4);
    }

    @Override
    public String startEngine() {
        return "Starting " + getClass().getSimpleName();
    }

    @Override
    public String accelerate() {
        return "Accelerating " + getClass().getSimpleName();
    }

    @Override
    public String brake() {
        return "Braking " + getClass().getSimpleName();
    }
}

// Convertible class.
class Convertible extends Car{

    public Convertible(){
        super("Convertible", 6);
    }

    @Override
    public String startEngine() {
        return "Starting " + getClass().getSimpleName();
    }

    @Override
    public String accelerate() {
        return "Accelerating " + getClass().getSimpleName();
    }

    @Override
    public String brake() {
        return "Braking " + getClass().getSimpleName();
    }
}

// Crossover class.
class Crossover extends Car{

    public Crossover(){
        super("Crossover",2);
    }

    @Override
    public String startEngine() {
        return "Starting " + getClass().getSimpleName();
    }

    @Override
    public String accelerate() {
        return "Accelerating " + getClass().getSimpleName();
    }

    @Override
    public String brake() {
        return "Braking " + getClass().getSimpleName();
    }
}
