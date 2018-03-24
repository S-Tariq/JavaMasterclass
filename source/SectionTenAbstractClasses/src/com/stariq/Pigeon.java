package com.stariq;

public class Pigeon extends Bird{

    public Pigeon(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Flying from branch to branch");
    }
}
