package com.stariq;

// Challenge given:
// Create a class and demonstrate proper encapsulation techniques.
// The class will be called Printer.
// It will simulate a real Computer Printer.
// It should have fields for the toner Level, number of pages printed, and
// also whether its a duplex printer (capable of printing on both sides of the paper).
// Add methods to fill up the toner (up to a maximum of 100%), another method to
// simulate printing a page (which should increase the number of pages printed).
// Decide on the scope, whether to use constructors, and anything else you think is needed.

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.pagesPrinted = 0;
        this.isDuplex = isDuplex;
    }

    public void fillToner(int fill) {
        int remaining = 100 - this.tonerLevel;
        if (fill > 0 && fill <= remaining) {
            this.tonerLevel += fill;
            System.out.println("Fill completed.");
        } else {
            System.out.println("Over the fill limit of 100.");
        }
    }

    public void printPages(int numberOfPages, boolean isDoubleSided) {
        if (isDoubleSided && isDuplex) {
            this.pagesPrinted += Math.ceil(numberOfPages / 2.0);
        } else if (isDoubleSided && !isDuplex) {
            System.out.println("Cannot print double sided as printer is not duplex.");
        } else {
            this.pagesPrinted += numberOfPages;
        }
    }

    public double getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}

