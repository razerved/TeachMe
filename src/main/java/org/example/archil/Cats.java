package org.example.archil;

public class Cats extends Animal {
    public Cats(String animalName, String animalType, String animalColor, String animalGender, int animalAge, double animalWeight) {
        super(animalName, animalType, animalColor, animalGender, animalAge, animalWeight);
    }

    @Override
    void swim() {
        System.out.println("Cats don't swim...");
    }

    @Override
    void jumps() {
        System.out.println("Cat's can jump really high...");
    }

    @Override
    void run() {
        System.out.println("Cats don't run they walk...");
    }

    @Override
    public void sayHello() {
        System.out.println("Cat tells you HELLO!");
    }

    @Override
    public void sayGoodbye() {
        System.out.println("Cat tells you GoodBye!");
    }

    @Override
    public void justMethod() {

    }
}