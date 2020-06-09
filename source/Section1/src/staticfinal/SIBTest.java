package staticfinal;

public class SIBTest {

    public static final String owner;

    static {
        owner = "Ann";
        System.out.println("First static initialisation block called");
    }

    public SIBTest(){
        System.out.println("Constructor called");
    }

    static {
        System.out.println("Second static initialisation block called");
    }

    public void someMethod(){
        System.out.println("someMethod called");
    }
}
