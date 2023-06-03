package org.example.dalegation;

public class MyMain {
    public static void main(String[] args) {
        Human human = new Human("Human", "Unemployed");

        human.runs();
        human.jumps();

        System.out.println();

        Archil archil = new Archil("Archil", "Employed");

        archil.jumps();
        archil.runs();
    }
}