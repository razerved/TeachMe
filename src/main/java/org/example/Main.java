package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //enterYorData();
        //enterSymbol('A');
        //enterSymbol();
        //bMI(65,1.80);

        }

    private static void enterYorData() {
        System.out.print("Please enter your Name: ");
        String name = new Scanner(System.in).next();
        System.out.print("Please enter your lastName: ");
        String lastName = new Scanner(System.in).next();
        System.out.print("Please enter your age: ");
        int age = new Scanner(System.in).nextInt();
        System.out.print("Please enter your height: ");
        double height  = new Scanner(System.in).nextDouble();
        System.out.print("Please enter your weight: ");
        double weight = new Scanner(System.in).nextDouble();

        System.out.println("Name: " + name + "\n" +
                           "lastName: " + lastName + "\n" +
                           "Age: " + age + "\n" +
                           "Height: " + height + "\n" +
                           "Weight: " + weight);

    }

    static void enterSymbol(char a){
        System.out.println( a + "-" + (int)a );
    }
    static void enterSymbol(){
        System.out.print("Please enter your symbol: ");
        char a = new Scanner(System.in).next().charAt(0);
        System.out.println( a + "-" + (int)a );
    }

    static void bMI(double weight, double height ){
        double mass = weight / (height * height);
        String result = new DecimalFormat( "#.#" ).format(mass);

        if (mass < 18.5) {
            System.out.println("Underweight: " + result);
        }
        else if (mass < 25) {
            System.out.println("Normal: " + result);
        }
        else if (mass < 30) {
            System.out.println("Overweight: " + result);
        }
        else {
            System.out.println("Obese: " + result);
        }

    }

}