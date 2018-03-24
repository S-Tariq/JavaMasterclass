package com.stariq;

public class Main {

    public static void main(String[] args) {
        addDog();
        addPigeon();
        addPenguin();
    }

    public static void addPenguin(){

        System.out.println("\n*****");

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();
    }

    public static void addPigeon(){

        System.out.println("\n*****");

        Pigeon pigeon = new Pigeon("Domestic Pigeon");
        pigeon.breathe();
        pigeon.eat();
        pigeon.fly();
    }

    public static void addDog(){

        System.out.println("\n*****");

        Dog dog = new Dog("Husky");
        dog.breathe();
        dog.eat();
    }

}
