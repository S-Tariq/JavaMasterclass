package com.stariq;

import static com.stariq.ThreadColour.ANSI_GREEN;
import static com.stariq.ThreadColour.ANSI_PURPLE;
import static com.stariq.ThreadColour.ANSI_RED;

public class Main {

    public static void main(String[] args) {

        System.out.println(ANSI_PURPLE + "Hello from the main thread.");

        // Subclass
        Thread anotherThread = new AnotherThread();
        anotherThread.setName("== Another Thread ==");
        anotherThread.start();

        // Anonymous class
        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN + "Hello from the anonymous thread.");
            }
        }.start();

        // Anonymous class
        Thread myRunnableAnon = new Thread(new MyRunnable() {
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Hello from anonymous class implementation.");
                try {
                    anotherThread.join(2000);
                    System.out.println(ANSI_RED + "AnotherThread terminated, or timed out, so I am running again.");
                } catch (InterruptedException e) {
                    System.out.println(ANSI_RED + "I could not wait after all. I was interrupted.");
                }
            }
        });
        myRunnableAnon.start();

        // Runnable class
        Thread myRunnableThread = new Thread(new MyRunnable());
        myRunnableThread.start();


        System.out.println(ANSI_PURPLE + "Hello again from the main thread.");


    }

}
