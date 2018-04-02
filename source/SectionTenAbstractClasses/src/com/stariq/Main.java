package com.stariq;

public class Main {

    public static void main(String[] args) {
//        addDog();
//        addPigeon();
//        addPenguin();
        addLinkedList();
    }

    public static void addLinkedList(){

        System.out.println("\n*****");

        MyLinkedList list = new MyLinkedList(null);
        list.traverse(list.getRoot());

        //String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
        String stringData = "5 7 3 9 8 2 1 0 4 6";
        String[] data = stringData.split(" ");

        for(String s : data){
            list.addItem(new Node(s));
        }

        list.traverse(list.getRoot());

        list.removeItem(new Node("3"));
        list.traverse(list.getRoot());

        list.removeItem(new Node("5"));
        list.traverse(list.getRoot());

        list.removeItem(new Node("0"));
        list.removeItem(new Node("4"));
        list.removeItem(new Node("2"));
        list.traverse(list.getRoot());

        list.removeItem(new Node("9"));
        list.traverse(list.getRoot());

        list.removeItem(new Node("8"));
        list.traverse(list.getRoot());

        list.removeItem(new Node("6"));
        list.traverse(list.getRoot());

        list.removeItem(list.getRoot());
        list.traverse(list.getRoot());
        list.removeItem(list.getRoot());
        list.traverse(list.getRoot());
    }

    public static void addPenguin(){

        System.out.println("\n*****");

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();
    }

    public static void addPigeon(){

        System.out.println("\n*****");

        Pigeon pigeon = new Pigeon("Domestic Pigeon");
        pigeon.breathe();
        pigeon.eat();
        pigeon.fly();
    }

    public static void addDog(){

        System.out.println("\n*****");

        Dog dog = new Dog("Husky");
        dog.breathe();
        dog.eat();
    }

}
