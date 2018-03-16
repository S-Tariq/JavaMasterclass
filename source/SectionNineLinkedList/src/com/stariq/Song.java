package com.stariq;

public class Song {

    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    // Overriding toString method from the Object class to show details of the song.
    @Override
    public String toString() {
        return title + ": " + duration;
    }
}
