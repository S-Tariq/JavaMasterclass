package com.stariq;

import java.util.ArrayList;

public class Gearbox {

    private ArrayList<Gear> gears = new ArrayList<Gear>();
    private int maxGears;
    private int gearNumber = 0;

    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        Gear neutral = new Gear(0, 0.0);
        gears.add(neutral);
    }

    public class Gear{

        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double driveSpeed(int revs){
            return revs * (ratio);
        }
    }
}
