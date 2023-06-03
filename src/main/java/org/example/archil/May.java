package org.example.archil;

import java.util.Scanner;

public class May {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isAlive = true;

        voidMethod(-1, 168, "Archil Sikharulidze", 'B', isAlive);
        System.out.println();
        System.out.println("Your BMI equals to: " + calculateBMI(1.71, 88.8));
        System.out.println();
        getInitialMsg();

        // двойное вложение метода норм, дальше лучше не надо
        int calculateHard = getNumOne() + getNumTwo();
        System.out.println(calculateHard);
    }

    public static void voidMethod(int param, int paramTwo, String name, char symbol, boolean isAlive)
    {
        // get parameters
        double sum = param * paramTwo;

        System.out.println("param * paramTwo: " + sum);
        System.out.println("You have passed String parameter: " + name);
        System.out.println("You have passed a char symbol: " + symbol);
        System.out.println("Are your dreams alive?: " + isAlive );

        // void - что метод ничего не возвращает
    }

    public static double calculateBMI(double height, double weight)
    {
        // BMI = weight / height**
        double BMI = weight / (height * height);

        return BMI;
    }

    public static int getNumOne()
    {
        return 10;
    }

    public static int getNumTwo()
    {
        return 30;
    }

    public static void getInitialMsg()
    {
        String msg = initialMsg();

        System.out.println(msg);
    }

    public static String initialMsg()
    {
        return "Welcome to Java dear friends...";
    }

    // Information about Stack (primitive) & Heap (ссылочный)
    public static void stackHeap()
    {
        // Примитивные и ссылочные типы данных

        // byte, short, int, long, char, float, double, boolean -> примитивные типы данных

        // String -> ссылочный

        // Stack (Стэк) - примитивные типы данных, краткосрочная память, память уровня методы
        // Heap (Куча) - ссылочные типы данных, долгосрочная память, память уровня класс, static

        int age = 34; // RAM -> Stack (age -> 34)
        int age2 = 34; // age == age2 -> легитимно, мы сравниваем два значения

        String name = "Archil"; // RAM -> Stack -> address 0x5FG -> Heap -> "Archil"
        String name2 = "Archil";

        // name == name2 -> mistake, сравнит не значения, а ссылки в Стеке
        // а ссылки типа String зачастую всегда разные
        // == -> нельзя сравнивать ссылочные типы данных

        // С++
        // RAM -> stack - какая именно память мне нужна и туда вложить
        // вложу в ту часть памяти, которая используется - она рухнет
    }
}