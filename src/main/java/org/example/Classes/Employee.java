package org.example.Classes;

public class Employee {

    // Class fields -> это его переменные общие для всего класса
    // На уровне класса все переменные получают by default values
    // int = 0, double = 0.0, String = null
    private String name = "Unknown"; // by default: Unknown
    private String surname = "Unknown"; // Unknown
    private int age;
    private int height;
    private double weight;
    private String profession; // Unknown
    String additionalInfo;

    // get - берут значение переменной из класса
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSurname() {
        return surname;
    }

    public double getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public String getProfession() {
        return profession;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    // set - задают значения для переменных класса
    void getFullInfo()
    {
        System.out.println("The Employee's name is: " + name);
        System.out.println("The Employee's surname is: " + surname);
        System.out.println("The Employee's age is: " + age);
        System.out.println("The Employee's height is: " + height);
        System.out.println("The Employee's weight is: " + weight);
        System.out.println("The Employee's profession is: " + profession);
        System.out.println("The Employee's additional info: " + additionalInfo);
    }
}