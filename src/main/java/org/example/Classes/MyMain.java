package org.example.Classes;

public class MyMain {
    public static void main(String[] args) {
        // Создал экземпляр класса (объекта) Employee (рабочий)
        // Все ссылочные типы, а класс - это ссылочный тип данных
        // Должны создаваться с помощью ключевого слова new
        // а new значит, динамически выдели мне память
        Employee archil = new Employee(); // каждый экземпляр класса независим от других
        Employee nikita = new Employee();
        Employee ivan = new Employee();

        // Возможность из другого класса получать прямой доступ к полям класса
        // к переменным - нарушает правило инкапсуляции, а это базовый принцип ООП
        // лишь та, часть должна быть видна, которая нужна для работы
        // Все остальное должно быть или скрыто или же к нему нельзя иметь прямой доступ
        archil.setName("Archil"); // archil.name = "Archil";
        archil.setSurname("Sikharulidze");
        archil.setAge(34);
        archil.setHeight(172);
        archil.setWeight(80);
        archil.setProfession("IT");
        archil.additionalInfo = "Additional Info"; // Don't do this!


        archil.getFullInfo();

        System.out.println();
        nikita.getFullInfo();

        System.out.println();
        ivan.getFullInfo();

        System.out.println();
        System.out.println("My first Employee's name is: " + archil.getName());

        System.out.println();

        nikita.setName("Nikita");
        nikita.setAge(30);

        System.out.println("Name: " + nikita.getName());
        System.out.println(nikita.getName() + " age is: " + nikita.getAge());

        //-----------------------------Animal-------------------------------

        System.out.println("\n\n");

        Animal lion = new Animal(); // Пустой конструктор

        lion.getInformation();

        System.out.println();

        Animal tiger = new Animal("Tiger", "Grey", "Female"); // с тремя переменным
        tiger.getInformation();

        // конструктор со всеми переменными
        Animal rhino = new Animal("Rhino", "Dark Grey", "Male", 5, 135);

        System.out.println();

        rhino.getInformation();

        System.out.println();

        Animal horse = new Animal("Horse");
        System.out.println("Animal name is: " + horse.getAnimalName());

        System.out.println();
        horse.getThis();
    }
}