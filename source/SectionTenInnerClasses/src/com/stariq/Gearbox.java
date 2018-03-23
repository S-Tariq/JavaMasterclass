package com.stariq;

import java.util.ArrayList;

public class Gearbox {

    private ArrayList<Gear> gears = new ArrayList<Gear>();
    private int maxGears;
    private int currentGear = 0;
    private boolean clutchIsIn;

    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        Gear neutral = new Gear(0, 0.0);
        gears.add(neutral);
    }

    public void operateClutch(boolean in){
        clutchIsIn = in;
    }

    public void addGear(int number, double ratio){
        if(number > 0 && number <= maxGears){
            gears.add(new Gear(number, ratio));
        }
    }

    public void changeGear(int newGear){
        if(newGear >= 0 && newGear < gears.size() && clutchIsIn){
            currentGear = newGear;
            System.out.println("Gear " + newGear + " selected");
        } else {
            System.out.println("Grind");
            currentGear = 0;
        }
    }

    public double wheelSpeed(int revs){
        if(clutchIsIn){
            System.out.println("Scream");
            return 0.0;
        }
        return revs * gears.get(currentGear).getRatio();
    }

    private class Gear{

        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double driveSpeed(int revs){
            return revs * (ratio);
        }

        public double getRatio() {
            return ratio;
        }
    }
}
