package org.example.archil;

public class MyMain {
    public static void main(String[] args) {
        catInterface();
    }

    public static void catInterface()
    {
        Cats cat = new Cats("ZCat", "Cat", "White",
                "Female", 2, 10);
        cat.sayHello();
        cat.sayGoodbye();

        Dogs dog = new Dogs("Dog", "Dog", "Blue", "Male", 0, 100);
    }

    public static void getToString()
    {
        Animal wolf = new Wolfs("Julia", "Wolf", "Grey",
                "Female", 2, 100);

        System.out.println(wolf);
    }

    public static void animalArray()
    {
        // int[] animal = 1, 2, 3
        // Animal[] zoo { class, class, class}...

        // abstract
        Animal[] zoo = {
                new Wolfs("Julia", "Wolf", "Grey", "Female", 2, 100),
                new Cats("Vaska", "Cat", "White","Male", 5, 10),
                new Dogs ("Ivan", "Dog","Mixed", "Male", 1, 10),
                new Dogs("Kristina", "Dog", "MixedRed", "Female", 3, 40)
        };

        for (Animal animals : zoo)
        {
            animals.getAllData();
            System.out.println();
        }

        System.out.println("\n");
        zoo[0].swim();
        System.out.println();
        zoo[1].swim();
        System.out.println();
        zoo[2].swim();

        System.out.println("\n");
        zoo[0].run();
        zoo[1].run();
        zoo[1].jumps();
        zoo[2].jumps();
    }

    public static void basicInheritance()
    {
        Animal cat = new Cats("Vaska", "Cat", "White",
                "Male", 5, 10);

        System.out.println();

        cat.getAllData();
        cat.run();
        cat.jumps();

        Animal dogIvan = new Dogs ("Ivan", "Dog",
                "Mixed", "Male", 1, 10);

        System.out.println();
        dogIvan.getAllData();
        dogIvan.run();
        dogIvan.jumps();

        Animal wolf = new Wolfs("Julia", "Wolf", "Grey",
                "Female", 2, 100);
        System.out.println();
        wolf.getAllData();
        wolf.run();
        wolf.jumps();
    }
}