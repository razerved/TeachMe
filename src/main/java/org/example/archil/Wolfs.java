package org.example.archil;

public class Wolfs extends Animal{
    public Wolfs(String animalName, String animalType, String animalColor, String animalGender, int animalAge, double animalWeight) {
        super(animalName, animalType, animalColor, animalGender, animalAge, animalWeight);
    }

    @Override
    void swim() {
        System.out.println("Wolf swim... but not far");
    }

    @Override
    public void sayHello() {

    }

    @Override
    public void sayGoodbye() {

    }

    @Override
    public void justMethod() {

    }
}