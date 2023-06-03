package org.example.archil;

// access modifier + abstract + keyword_ class
public abstract class Animal implements GeneralInterface, GenInterface {
    private String animalName;
    private String animalType;
    private String animalColor;
    private String animalGender;
    private int animalAge;
    private double animalWeight;

    public Animal(String animalName, String animalType, String animalColor,
                  String animalGender, int animalAge, double animalWeight)
    {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalColor = animalColor;
        this.animalGender = animalGender;
        this.animalAge = animalAge;
        this.animalWeight = animalWeight;
    }

    // Declare method with realization in the subClass
    // abstract -> реализация тела пусть будет перенесено в наследуемые классы
    abstract void swim();

    void run()
    {
        System.out.println(animalType + " runs...");
    }

    void jumps()
    {
        System.out.println(animalType + " jumps...");
    }

    // toString()
    @Override
    public String toString() {
        return "Animal name: " + this.animalName + "\n" +
                "Animal type: " + this.animalType + "\n" +
                "Animal color: " + this.animalColor + "\n" +
                "Animal gender: " + this.animalGender + "\n" +
                "Animal age: " + this.animalAge + "\n" +
                "Animal weight: " + this.animalWeight;
    }

    // No access modifier means default access modifier -> package level
    void getAllData()
    {
        System.out.println("Animal name: " + this.animalName);
        System.out.println("Animal type: " + this.animalType);
        System.out.println("Animal color: " + this.animalColor);
        System.out.println("Animal gender: " + this.animalGender);
        System.out.println("Animal age: " + this.animalAge);
        System.out.println("Animal weight: " + this.animalWeight);
    }
}