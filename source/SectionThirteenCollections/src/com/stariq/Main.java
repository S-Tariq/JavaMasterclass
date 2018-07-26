package com.stariq;

public class Main {

    public static void main(String[] args) {
        addTheatre();
        addBinarySearchTheatre();
    }

    public static void addBinarySearchTheatre(){
        System.out.println("\n*****");
        BinarySearchTheatre theatre = new BinarySearchTheatre("Olympian", 8, 12);
//        theatre.getSeats();
        if(theatre.reserveSeat("D12")){
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }
        if(theatre.reserveSeat("B13")){
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }
    }

    public static void addTheatre(){
        System.out.println("\n*****");
        Theatre theatre = new Theatre("Olympian", 8, 12);
        theatre.getSeats();
        if(theatre.reserveSeat("H11")){
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }
        if(theatre.reserveSeat("H11")){
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }
    }
}
