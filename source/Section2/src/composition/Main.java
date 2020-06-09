package composition;

public class Main {

    public static void main(String[] args) {
        addPCs();
        addBedrooms();
        addKitchens();
    }

    public static void addKitchens(){

        System.out.println("\n*****");

        // Adds details to Cupboard, Sink and Oven class.
        Cupboard cupboard = new Cupboard(24,45);
        Sink sink = new Sink("Stainless stain", "Silver");
        Oven oven = new Oven(110);

        // Adds details to Kitchen class and uses methods from different classes.
        Kitchen kitchen = new Kitchen("Large", cupboard, sink, oven);
        kitchen.clean();
        kitchen.cook();
        kitchen.getOven().increaseHeat();
        kitchen.getSink().turnOn();
        kitchen.getSink().turnOff();
    }

    public static void addBedrooms(){

        System.out.println("\n*****");

        // Add details to Wall, Ceiling, Bed, Lamp and Dresser class.
        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("West");
        Ceiling ceiling = new Ceiling(12,"white");
        Bed bed = new Bed("Modern", 4, 3, 2,1);
        Lamp lamp = new Lamp("Classic", false, 60);
        Dresser dresser = new Dresser(10, "brown");

        // Adds details to Bedroom class and uses methods from different classes.
        Bedroom bedroom = new Bedroom("Tariqs", wall1, wall2, wall3, wall4, ceiling, bed, lamp, dresser);
        bedroom.makeBed();
        bedroom.getLamp().turnOn();
        bedroom.getDresser().shutDrawers();
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
