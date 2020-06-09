package composition;

// Challenge given:
// Create a single room of a house using composition.
// Think about the things that should be included in the room.
// Maybe physical parts of the house and furniture as well.
// Add at least one method to access an object via a getter and
// then that objects public method.
// Add at least one method to hide the object e.g. not using a getter
// to access the object used in composition within the main class.

public class Kitchen {

    private String size;
    private Cupboard cupboard;
    private Sink sink;
    private Oven oven;

    public Kitchen(String size, Cupboard cupboard, Sink sink, Oven oven) {
        this.size = size;
        this.cupboard = cupboard;
        this.sink = sink;
        this.oven = oven;
    }

    public void cook(){
        System.out.println("Kitchen.cook() called.");
    }

    public void clean(){
        System.out.println("Kitchen.clean() called.");
    }

    public Sink getSink(){
        return this.sink;
    }

    public Oven getOven(){
        return this.oven;
    }
}
