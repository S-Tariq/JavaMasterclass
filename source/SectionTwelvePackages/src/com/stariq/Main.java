package com.stariq;

import com.stariq.game.ISaveable;
import com.stariq.game.Monster;
import com.stariq.game.Player;

public class Main {

    public static void main(String[] args) {

       //addMyWindow();

        // The Player class, Monster class and ISaveable interface are being imported from an external library/jar file.
        addPlayer();
        addMonster();
    }

    public static void addMonster(){

        System.out.println("\n*****");

        ISaveable monster = new Monster("Werewolf",65,89);
        System.out.println(monster);
        System.out.println("Strength: " + ((Monster) monster).getStrength());
        saveObject(monster);
    }

    public static void addPlayer(){

        System.out.println("\n*****");

        Player player = new Player("Emma", 10,15);
        System.out.println(player.toString());
        saveObject(player);
        player.setHitPoints(12);
        System.out.println(player);
        player.setWeapon("Knife");
        saveObject(player);

    }

    public static void saveObject(ISaveable objectToSave){
        for(int i = 0; i < objectToSave.write().size(); i++){
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void addMyWindow(){
        MyWindow myWindow = new MyWindow("Complete Java");
        myWindow.setVisible(true);
    }
}
