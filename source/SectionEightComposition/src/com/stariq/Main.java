package com.stariq;

public class Main {

    public static void main(String[] args) {
        addPCs();
    }

    public static void addPCs(){

        System.out.println("\n*****");

        // Adds details to Dimensions, Case, Monitor and Motherboard class.
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27,
                new Resolution(2540,1440));
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4,6,"v2.44");

        // Adds details to the PC class and makes use of methods from the objects created.
        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();

        // Uses getters from the PC class.
//        thePC.getMonitor().drawPixelAt(1500, 1200, "red");
//        thePC.getMotherboard().loadProgram("Windows 1.0");
//        thePC.getTheCase().pressPowerButton();

    }
}
