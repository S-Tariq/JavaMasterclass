package stariq.encapsulation;

class Main {

    public static void main(String args[]) {
        addPlayers();
        addEnhancePlayers();
        addPrinters();
    }

    public static void addPrinters(){

        System.out.println("\n*****");

        // Adds details to Printer class which involves stariq.encapsulation.
        Printer printer = new Printer(75,false);
        printer.fillToner(15);
        System.out.println("Toner level: " + printer.getTonerLevel());
        printer.printPages(15,false);
        System.out.println("Pages printed: " + printer.getPagesPrinted());
    }

    public static void addEnhancePlayers(){

        System.out.println("\n*****");

        // Adds details to EnhancePlayer class which involves stariq.encapsulation.
        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Tariq", 200, "Sword");
        System.out.println("Initial health is " + enhancedPlayer.getHealth());
        enhancedPlayer.loseHealth(20);
        System.out.println("Health after damage is " + enhancedPlayer.getHealth());
    }

    public static void addPlayers(){

        System.out.println("\n*****");

        // Adds details to Player class which does not involve stariq.encapsulation.
        Player player = new Player();
        player.name = "Tariq";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        damage = 11;
        player.health = 200;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());
    }
}



