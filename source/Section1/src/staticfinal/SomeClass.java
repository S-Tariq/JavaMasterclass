package staticfinal;

public class SomeClass {


    private static int classCounter = 0;
    private final int instanceNumber; // Marked as final to prevent modification once initialised within the constructor.
    private final String name;

    public SomeClass(String name) {
        this.name = name;
        classCounter++;
        instanceNumber = classCounter;
        System.out.println(name + " created, instance is " + instanceNumber);
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }
}
