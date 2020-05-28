package com.stariq;

public class DogMain {

    public static void main(String[] args){
        Labrador labrador = new Labrador("Rover");
        Dog dog = new Dog("Rover");

        // Returns true as Labrador is an instance of Dog
        System.out.println(dog.equals(labrador));

        // Returns false as Dog is not an instance of Labrador
        System.out.println(labrador.equals(dog));
    }
}
