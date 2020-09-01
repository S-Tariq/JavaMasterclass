package stariq.constructors;

public class Main {

    public static void main(String[] args) {
        addCars();
        addBankAccounts();
        addVipCustomers();
    }

    public static void addCars(){

        System.out.println("\n*****");

        // Instantiates class.
        Car porsche = new Car();
        Car holden = new Car();

        // Adds details to Car class.
        System.out.println("\nCar details: ");
        porsche.setModel("Carrera");
        holden.setModel("911");
        System.out.println("Model is " + porsche.getModel());
        System.out.println("Model is " + holden.getModel());
    }

    public static void addBankAccounts(){

        System.out.println("\n*****");

        // Adds details to BankAccount class.
        System.out.println("\nAccount details: ");

        // Uses constructor without parameters.
        BankAccount accountOne = new BankAccount();
        accountOne.setAccountNo("28");
        accountOne.setName("Emma");
        accountOne.setEmail("emma16@email");
        accountOne.setPhoneNo("07711");
        accountOne.setBalance(100);
        accountOne.printDetails();

        // Uses constructor with all parameters.
        BankAccount accountTwo = new BankAccount("34", "Harry",
                "harry10@email", "07123", 200);
        accountTwo.printDetails();

        // Uses constructor with some parameters.
        BankAccount accountThree = new BankAccount("Ben","ben45@email","07859");
        accountThree.printDetails();

        // Creates transactions.
        System.out.println("\nTransaction details: ");
        accountOne.withdrawFunds(50);
        accountOne.depositFunds(20);
        accountTwo.depositFunds(100);
        accountTwo.withdrawFunds(70);
        accountThree.depositFunds(120);

        // Uses getters.
        System.out.println("Customer " + accountThree.getName() +
                "'s contact details are: " + accountThree.getEmail() +
                " and " + accountThree.getPhoneNo());
        System.out.println("Customer " + accountTwo.getName() +
                "'s account number is " + accountTwo.getAccountNo() +
                " and balance is " + accountTwo.getBalance());
    }

    public static void addVipCustomers(){

        System.out.println("\n*****");

        // Adds details to VipCustomer class.
        System.out.println("\nVip Customer details: ");

        // Uses constructor with all initialisation within default constructor.
        VipCustomer customerOne = new VipCustomer();
        customerOne.printDetails();

        // Uses constructor with some parameters and default value.
        VipCustomer customerTwo = new VipCustomer("Bella", 250);
        customerTwo.printDetails();

        // Uses constructor with all parameters.
        VipCustomer customerThree = new VipCustomer("Jane", 520, "jane7@email");
        customerThree.printDetails();

        // Uses getters.
        System.out.println("Customer " + customerOne.getName() +
                " has email address as " + customerOne.getEmail());
        System.out.println("Customer " + customerTwo.getName() +
                " has credit limit of " + customerTwo.getCreditLimit());
    }
}
