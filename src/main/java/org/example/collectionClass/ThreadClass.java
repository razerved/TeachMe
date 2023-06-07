package org.example.collectionClass;

public class ThreadClass {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        System.out.println("Let's go sleep for 5 seconds");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Slept for 5 seconds...");

        Thread threadTwo = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int index = 0; index < 10; index++)
                    System.out.println("Thread Two: " + index);
            }
        });
        threadTwo.start();

        Thread threadThree = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int index = 0; index < 10; index++)
                    System.out.println("Thread Three: " + index);
            }
        });
        threadThree.start();
    }
}