package com.stariq;

import java.util.HashSet;
import java.util.Set;

public final class HeavenlyBody {

    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(satellites);
    }

    public boolean addMoon(HeavenlyBody moon){
        return this.satellites.add(moon);
    }

    @Override
    public boolean equals(Object obj) {

        // The object is being compared to this object.
        if(this == obj){
            return true;
        }
        System.out.println("obj.getClass() is " + obj.getClass());
        System.out.println("this.getClass() is " + this.getClass());

        // The class of the object is being compared to the class of this object.
        // Checks for null value of object first.
        if((obj == null) || (obj.getClass() != this.getClass())){
            return false;
        }

        // The name of the object is being compared to the name of this object.
        // It is casted to HeavenlyBody as Object does not have a getName() method.
        // Only strings are being compared hence why equals() method from String class is being called.
        String objName = ((HeavenlyBody) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        // Since the comparison involves strings the hashCode() method from String class is being called.
        System.out.println("Hashcode called");
        return this.name.hashCode() + 57;
    }
}
