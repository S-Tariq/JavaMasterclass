package com.stariq;

// Challenge given:
// Create a single room of a house using composition.
// Think about the things that should be included in the room.
// Maybe physical parts of the house and furniture as well.
// Add at least one method to access an object via a getter and
// then that objects public method.
// Add at least one method to hide the object e.g. not using a getter
// to access the object used in composition within the main class.

public class Bedroom {

    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;
    private Dresser dresser;

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4,
                   Ceiling ceiling, Bed bed, Lamp lamp, Dresser dresser) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
        this.dresser = dresser;
    }

    public Lamp getLamp(){
        return this.lamp;
    }

    public Dresser getDresser(){
        return this.dresser;
    }

    public void makeBed(){
        System.out.println("Bedroom.makeBed() called.");
        bed.make();
    }
}
