package com.stariq;

class Main {

    public static void main(String args[]) {
        addPlayers();
        addEnhancePlayers();

    }

    public static void addEnhancePlayers(){

        System.out.println("\n*****");

        // EnhancePlayer class used with encapsulation.
        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Tariq", 200, "Sword");
        System.out.println("Initial health is " + enhancedPlayer.getHealth());
        enhancedPlayer.loseHealth(20);
        System.out.println("Health after damage is " + enhancedPlayer.getHealth());
    }

    public static void addPlayers(){

        System.out.println("\n*****");

        // Player class used without encapsulation.
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



