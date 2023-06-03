package org.example.dalegation;

public class Human {
    private String name;
    private String profession;

    public Human(String name, String profession)
    {
        this.name = name;
        this.profession = profession;
    }

    void jumps()
    {
        System.out.println(name + " jumps...");
    }

    void runs()
    {
        System.out.println(name + " runs...");
    }
}