package com.stariq;

import java.util.ArrayList;

public class Album {

    private String name;
    private String artist;

    private ArrayList<Song> songs = new ArrayList<Song>();

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
    }

    public boolean addSong(String title, double duration){
        if(findSong(title) == null){
            songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

}
