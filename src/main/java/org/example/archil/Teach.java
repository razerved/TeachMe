package org.example.archil;

import java.util.Scanner;
public class Teach {
    // Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
        public static void main(String[] args) {
            // getInformation();
            // initializeVariables();
            getBMI();
        }
        public static void getInformation()
        {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter name:");
            String name = in.nextLine();

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter surname:");
            String surname = sc.nextLine();

            Scanner as = new Scanner(System.in);
            System.out.println("Enter age:");
            int age = as.nextInt();

            Scanner aw = new Scanner(System.in);
            System.out.println("Enter height:");
            int height = aw.nextInt();

            Scanner aq = new Scanner(System.in);
            System.out.println("Enter weight:");
            int weight = aq.nextInt();

            System.out.println("Name: " + name );
            System.out.println("Surname: " + surname);
            System.out.println("Age: " + age);
            System.out.println("Height: " + height);
            System.out.println("Weight: " + weight);
        }
        public static void initializeVariables()
        {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter symbol:");
            char mySymbol = in.next().charAt(0);
            int x = mySymbol;

            System.out.println(mySymbol + " - " + x);
        }
        public static void getBMI()
        {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter height:");
            int height = in.nextInt();

            Scanner aq = new Scanner(System.in);
            System.out.println("Enter weight:");

            double weight = aq.nextDouble();
            double height1 = (double) height  / 100;
            double height2 = Math.pow(height1,2);
            double BMI = weight / height2;

            System.out.println("Result: " + BMI);
        }
    }

