package innerclasses;

import java.util.*;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Button buttonPrint = new Button("Print");
    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
        addGearbox();
        addButton();
        anonButton();
        addAlbum();
    }

    public static void addAlbum(){

        System.out.println("\n*****");

        Album album = new Album("Blackout","Britney Spears");
        album.addSong("Radar", 3.49);
        album.addSong("Gimme more", 4.11);
        album.addSong("Piece of me", 3.32);
        album.addSong("Break the ice", 3.16);
        album.addSong("Hot as ice", 3.17);
        album.addSong("Freakshow", 2.56);
        album.addSong("Toy soldier", 3.22);
        albums.add(album);

        album = new Album("Let Go","Avril Lavigne");
        album.addSong("Complicated", 4.05);
        album.addSong("Unwanted", 3.41);
        album.addSong("Losing grip", 3.54);
        album.addSong("My world", 3.27);
        album.addSong("Tomorrow", 3.49);
        albums.add(album);

        LinkedList<Song> playlist = new LinkedList<Song>();

        albums.get(0).addToPlaylist("Gimme more", playlist);
        albums.get(0).addToPlaylist("Break the ice", playlist);
        albums.get(0).addToPlaylist("Toxic", playlist); // Does not exist.
        albums.get(0).addToPlaylist(5,playlist);

        albums.get(1).addToPlaylist("Complicated", playlist);
        albums.get(1).addToPlaylist(3, playlist);
        albums.get(1).addToPlaylist(4, playlist);
        albums.get(1).addToPlaylist(24, playlist); // Does not exist.

        play(playlist);
    }

    public static void play(LinkedList<Song> playlist){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> listIterator = playlist.listIterator();

        if(playlist.size() == 0){
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing: \n - " + listIterator.next().toString());
            printMenu();
        }

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing: \n - " + listIterator.next().toString());
                    } else {
                        System.out.println("Reached end of playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing: \n - " + listIterator.previous().toString());
                    } else {
                        System.out.println("Reached start of playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now replaying: \n - " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("Reached start of list");
                        }
                    } else {
                        if(listIterator.hasNext()){
                            System.out.println("Now replaying: \n - " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("Reached end of list");
                        }
                    }
                    break;
                case 4:
                    printList(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playlist.size() > 0){
                        listIterator.remove();
                        System.out.println("Song removed");
                        if(listIterator.hasNext()){
                            System.out.println("Now playing: \n - " + listIterator.next());
                        } else if(listIterator.hasPrevious()){
                            System.out.println("Now playing: \n - " + listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }

    public static void printMenu(){
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4 - list songs in the playlist\n" +
                "5 - print available actions\n" +
                "6 - to remove the current song");
    }

    private static void printList(LinkedList<Song> playlist){
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("List of songs: ");
        while(iterator.hasNext()){
            System.out.println(" - " + iterator.next().toString());
        }
    }

    public static void addGearbox(){

        System.out.println("\n*****");

        Gearbox mcLaren = new Gearbox(6);
        mcLaren.operateClutch(true);
        mcLaren.changeGear(1);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(1000));
        mcLaren.changeGear(2);
        System.out.println(mcLaren.wheelSpeed(3000));
        mcLaren.operateClutch(true);
        mcLaren.changeGear(3);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(6000));
    }

    public static void addButton(){

        System.out.println("\n*****");

        class ClickListener implements Button.OnClickListener {

            public ClickListener(){
                System.out.println("I have been attached");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        }

        buttonPrint.setOnClickListener(new ClickListener());
        listen();
    }

    public static void listen(){
        boolean quit = false;

        while(!quit){
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    buttonPrint.onClick();
            }
        }
    }

    public static void anonButton(){

        System.out.println("\n*****");

        buttonPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });
        listen();
    }
}
