package org.example.AbstractClasses;

public class Car implements Comparable{
    private String name;
    private String color;

    public Car(String name, String color)
    {
        this.name = name;
        this.color = color;
    }

    void getData()
    {
        System.out.println(this.name);
        System.out.println(this.color);
    }

    void getMsg()
    {
        System.out.println("Get general msg...");
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}