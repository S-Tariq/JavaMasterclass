package sets;

import java.util.HashSet;
import java.util.Set;

public abstract class HeavenlyBody {

    private final Key key;
//    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
//    private final BodyTypes bodyType;

    public enum BodyTypes {
        STAR,
        PLANET,
        DWARF_PLANET,
        MOON,
        COMET,
        ASTEROID
    }

    public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyType) {
        this.key = new Key(name, bodyType);
//        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
//        this.bodyType = bodyType;
    }

//    public String getName() {
//        return name;
//    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(satellites);
    }

//    public BodyTypes getBodyType() {
//        return bodyType;
//    }


    public Key getKey() {
        return key;
    }

    public boolean addSatellite(HeavenlyBody moon){
        return this.satellites.add(moon);
    }

    @Override
    public final boolean equals(Object obj) {

        // The object is being compared to this object.
        if(this == obj){
            return true;
        }

        if(obj instanceof HeavenlyBody){
            HeavenlyBody theObject = (HeavenlyBody) obj;
            return this.key.equals(theObject.getKey());
//            if(this.name.equals(theObject.getName())){
//                return this.bodyType == theObject.getBodyType();
//            }
        }
        return false;

        // The class of the object is being compared to the class of this object.
        // Checks for null value of object first.
//        if((obj == null) || (obj.getClass() != this.getClass())){
//            return false;
//        }

        // The name of the object is being compared to the name of this object.
        // It is casted to HeavenlyBody as Object does not have a getName() method.
        // Only strings are being compared hence why equals() method from String class is being called.
//        String objName = ((HeavenlyBody) obj).getName();
//        return this.name.equals(objName);
    }

    @Override
    public final int hashCode() {
        // Since the comparison involves strings the hashCode() method from String class is being called.
//        return this.name.hashCode() + 57 + this.bodyType.hashCode();
        return this.key.hashCode();
    }

    public static Key makeKey(String name, BodyTypes bodyType){
        return new Key(name, bodyType);
    }

    @Override
    public String toString() {
        return this.key.name + ": " + this.key.bodyType + ", " + this.orbitalPeriod;
    }

    public static final class Key {

        private String name;
        private BodyTypes bodyType;

        private Key(String name, BodyTypes bodyType){
            this.name = name;
            this.bodyType = bodyType;
        }

        public String getName() {
            return name;
        }

        public BodyTypes getBodyType() {
            return bodyType;
        }

        @Override
        public int hashCode() {
            return this.name.hashCode() + 57 + this.bodyType.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            Key key = (Key) obj;

            if(this.name.equals(key.getName())){
                return(this.bodyType == key.getBodyType());
            }
            return false;
        }

        @Override
        public String toString() {
            return this.name + ": " + this.bodyType;
        }
    }
}
