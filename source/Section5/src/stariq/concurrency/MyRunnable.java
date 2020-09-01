package stariq.concurrency;

import static stariq.concurrency.ThreadColour.ANSI_RED;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from my runnable thread.");
    }
}
