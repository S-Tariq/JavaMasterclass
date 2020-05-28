package com.stariq;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        addDeskPhone();
        addMobilePhone();
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
        loadObject(player);
        System.out.println(player);
    }

    public static void saveObject(ISaveable objectToSave){
        for(int i = 0; i < objectToSave.write().size(); i++){
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }

    // Simulates getting values from a file.
    public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;

        System.out.println("Choose:\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while(!quit){
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index,stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void addDeskPhone(){

        System.out.println("\n*****");

        ITelephone phone;
        phone = new DeskPhone(3456433);
        phone.powerOn();
        phone.callPhone(3456433);
        phone.answer();
    }

    public static void addMobilePhone(){

        System.out.println("\n*****");

        ITelephone phone = new MobilePhone(557856);
        phone.powerOn();
        phone.callPhone(557856);
        phone.answer();
    }
}
