package com.stariq;

public class Main {

    public static void main(String[] args) {
        addAnimals();
        addVehicles();
    }

    public static void addAnimals(){

        System.out.println("\n*****");

        // Adds details to Animal class.
        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        animal.move(4);

        // Adds details to Dog class.
        Dog dog = new Dog("Yorkie", 8,20,2,4,1,20,"Long silky");
        dog.eat();
        dog.walk();
        dog.run();

        // Adds details to Fish class.
        Fish fish = new Fish("Goldfish", 2,4,2,2,4);
        fish.swim(2);
    }

    public static void addVehicles(){

        System.out.println("\n*****");

        // Adds details for Vehicle class.
        Vehicle vehicle = new Vehicle("Motorcycle", "Blue", "2Wheel");
        vehicle.move(20, 40);

        // Adds details for Car class.
        Car car = new Car("SUV", "Red", "4Wheel", 4,4, 5, true);
        car.move(40,24);
        car.playStereo();

        // Adds details for Convertible class.
        Convertible convertible = new Convertible("","Soft top");
        convertible.steer(90);
        convertible.accelerate(20);
        convertible.accelerate(10);
        convertible.accelerate(-15);
        convertible.playStereo();
    }
}
