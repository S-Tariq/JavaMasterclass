package stariq.synchronization;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Message message = new Message();
        (new Thread(new Writer(message))).start();
        (new Thread(new Reader(message))).start();
    }

}

class Message {
    private String message;
    private boolean empty = true;

    // Both read/write methods are synchronized so a thread can only enter either one of those methods but not both at the same time.

    // Read method used by consumer
    public synchronized String read() {
        while(empty) {
            try {
                System.out.println("Waiting in read()");
                wait();
            } catch(InterruptedException e) {

            }
        }
        empty = true;
        notifyAll();
        return message;
    }

    // Write method used by producer
    public synchronized void write(String message) {
        while(!empty) {
            try {
                System.out.println("Waiting in write()");
                wait();
            } catch (InterruptedException e) {

            }
        }
        empty = false;
        this.message = message;
        notifyAll();
    }
}

class Writer implements Runnable {
    private Message message;

    public Writer (Message message) {
        this.message = message;
    }

    public void run() {
        String messages[] = {
                "Humpty Dumpty sat on a wall",
                "Humpty Dumpty had a great fall",
                "All the king's horses and all the king's men",
                "Couldn't put Humpty together again"
        };

        Random random = new Random();

        for(int i = 0; i < messages.length; i++) {
            message.write(messages[i]);
            System.out.println("Written " + Math.addExact(i, 1) + " message");
            try {
                System.out.println("Sleeping in Writer");
                Thread.sleep(random.nextInt(2000)); // 2 seconds
            } catch (InterruptedException e) {

            }
        }
        message.write("Finished");
    }
}

class Reader implements Runnable {
    private Message message;

    public Reader(Message message) {
        this.message = message;
    }

    public void run() {
        Random random = new Random();

        for(String latestMessage = message.read(); !latestMessage.equals("Finished"); latestMessage = message.read()) {
            System.out.println(latestMessage);
            try {
                System.out.println("Sleeping in Reader");
                Thread.sleep(random.nextInt(2000));
            } catch (InterruptedException e) {

            }
        }
    }
}
