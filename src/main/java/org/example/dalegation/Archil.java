package org.example.dalegation;

public class Archil {
    private String name;
    private String profession;
    private int age;
    private int height;
    private Human human;

    public Archil(String name, String profession)
    {
        this.name = name;
        this.profession = profession;
        human = new Human(this.name, this.profession);
    }

    void jumps()
    {
        this.human.jumps();
    }

    void runs()
    {
        this.human.runs();
    }
}