package org.example.Classes;

public class Animal {
    private String animalName; // у меня переменная уровня класса
    private String animalColor;
    private String gender;
    private int age;
    private double weight;

    // Заводские настройки в классе задаются с использованием Конструктора (Constructor)
    // Constructor - имя конструктора совпадает с именем класса
    // Если у класса не прописан никакой конструктор, то компилятор все равно его позже добавит
    // просто пустой - без чего-либо: public Animal(){}
    // Но если вы создали хотя бы один конструктор, то компилятор ничего уже добавлять не будет сам
    public Animal()
    {
        animalName = "Unknown";
        animalColor = "Unknown";
        gender = "Unknown";
    }

    public Animal(String animalName) // переменная уровня конструктора, null
    {
        // null = null
        // animalName = animalName; // local variable animalName = local variable animalName
        this.animalName = animalName; // Animal.animalName = animalName;
    }

    public Animal(String name, String color, String animalGender)
    {
        animalName = name;
        animalColor = color;
        gender = animalGender;
    }

    public Animal(String name, String color, String animalGender, int setAge, int setWeight)
    {
        animalName = name;
        animalColor = color;
        gender = animalGender;
        age = setAge;
        weight = setWeight;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void getInformation()
    {
        System.out.println("Animal type is: " + this.animalName);
        System.out.println("Animal color is: " + this.animalColor);
        System.out.println("Animal gender is: " + this.gender);
        System.out.println("Animal age is: " + age);
        System.out.println("Animal weight is: " + weight);
    }

    public void getThis()
    {
        System.out.println(this); // Будет ссылка на место в памяти, где хранится мой рабочий
    }
}