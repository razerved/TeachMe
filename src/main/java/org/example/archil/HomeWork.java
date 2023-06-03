package org.example.archil;

import java.util.Random;
import java.util.Scanner;

// Homework 5
public class HomeWork {
    public static void main(String[] args) {
        // call method deleteArrayElements()
        deleteArrayElements();
    }

    public static void deleteArrayElements() {
        // Создать оригинальный массив с определяемым количество элементов
        // это количество можно указать с помощью класса Scanner
        // С помощью Scanner ввести число и проверить существование этого числа в массива
        // Если число есть в массиве, то убрать его оттуда и вывести массив заново.

        // Алгоритм - это определенная очередность действий в определенно порядке
        // 1. Создать массив
        // 2. Надо создать сканнер, который присвоит количество элементов моему массиву
        // 3. Надо использовать сканнер, чтобы ввести целое число
        // 4. Это число надо сохранить
        // 5. Надо пройтись по всему массиву и посмотреть есть ли это числов в массиве
        // 6. Если его нету, то массив не меняется
        // 7. Если он есть, то надо посчитать сколько раз это число есть в массиве
        // 8. Надо создать новый массив и дать ему значение количество элементов по формуле
        // 9. originArrray.length - counter (количество совпадений).
        // 10. Скопировать все элементы массива с несоответствующим значением в новый массив

//        int[] numbers = new int[]{1, 19, -1, 100, 5, 4, 1};
//
//        System.out.println("There is an array of x elements with numbers.");
//        System.out.print("Please, enter a number to check whether it is in the array: ");
//        int enteredNumber = insert().nextInt();
//
//        System.out.print("Original array is: ");
//        getArray(numbers);
//
//        System.out.print("\nThe new array is: ");
//
//        for (int index = 0; index < numbers.length; index++) {
//            if (numbers[index] == enteredNumber) {
//                continue;
//            }
//            System.out.print(numbers[index] + "; ");
//        }
//
//        System.out.println("\n------------------New realisation of the same topic-----------");
//
//        int counter = 0;
//
//        // Сколько раз значение элемента массива совпало со значением, которое я ввел с клавиатуры
//        for (int index = 0; index < numbers.length; index++) {
//            if (numbers[index] == enteredNumber) {
//                counter++;
//            }
//        }
//
//        if (counter == 0) {
//            getArray(numbers);
//        } else
//        {
//            // 8. Надо создать новый массив и дать ему значение количество элементов по формуле
//            // 9. originArrray.length - counter (количество совпадений).
//            // 10. Скопировать все элементы массива с несоответствующим значением в новый массив
//        }

        getRandomArray();
        forLoop();
    }

    public static Scanner insert()
    {
        return new Scanner(System.in);
    }

    // Метод для вывода любого одномерного массива
    public static void getArray(int[] array)
    {
        for (int index = 0; index < array.length; index++)
        {
            System.out.print(array[index] + "; ");
        }
    }

    public static void getRandomArray()
    {
        // Создайте массив из n случайных целых чисел и выведите его на экран.

        System.out.println("Welcome to additional task.");
        System.out.print("Please, enter number of elements to create an array: ");

        // int[] randomArray = new int[new Scanner(System.in).nextInt()];
        // тоже самое, что и ниже
        int[] randomElArray = new int[insert().nextInt()];

        // Math.random(); - JavaScript
        // Java встроенный класс: class Random;

        Random randomNumber = new Random();

        for (int index = 0; index < randomElArray.length; index++)
        {
            // nextInt() -> берет весь охват
            // от числа до числа (не по)
            randomElArray[index] = randomNumber.nextInt(1, 11);
        }

        getArray(randomElArray);

        System.out.println("\n-------------------Math.random()----------------------");

        // Math.random() -> 0.000 по 0.9999999
        System.out.println("Welcome to additional task.");
        System.out.print("Please, enter number of elements to create an array: ");
        int[] mathRandomArray = new int[insert().nextInt()];

        for (int index = 0; index < mathRandomArray.length; index++)
        {
            mathRandomArray[index] = (int) (Math.random() * 100) + 1; // 0.0000 - 0.9999999, 0.15
            // 0.8999 * 10 = 8
        }

        getArray(mathRandomArray);
    }




    public static void forLoop()
    {
        for (int index = 5; index >= 1; index--)
        {
            System.out.println(index);
        }
    }

    public static void switchYear()
    {
        int num = getInsert().nextInt();

        switch (num)
        {
            case 1:
            case 2:
                System.out.println("This is a Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("This is a Spring.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("This is a Summer.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("This is an Autumn.");
                break;
            case 12:
                System.out.println("This is a Winter.");
                break;
            default:
                System.out.println("There is no such month number in the year...");
                break;
        }
    }

    public static Scanner getInsert()
    {
        return new Scanner(System.in);
    }
}