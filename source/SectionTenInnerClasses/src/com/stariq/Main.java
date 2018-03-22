package com.stariq;

public class Main {

    public static void main(String[] args) {
        addGearbox();
    }

    public static void addGearbox(){

        System.out.println("\n*****");

        Gearbox mcLaren = new Gearbox(6);
        Gearbox.Gear first = mcLaren.new Gear(1,12.12);
        System.out.println(first.driveSpeed(1000));
    }
}
