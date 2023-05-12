package org.example;


import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*integerNumOrNot(2);
        getSeason(1);
        getSeasonByIf(2);
        getTemperature(-20.1);
        getNumOfColour(8);*/

        /*squaredNumber();
        getTenFirstNumber();
        loopWhile();
        getSumNumberLoop();
        getNotInteger();
        fromMoreToLess();*/

    }



    //================================================= The first part ===============================================//

    private static void getNumOfColour(int color) {
        if (color == 1){
            System.out.println("Red");
        }else if (color == 2){
            System.out.println("Orange");
        }else if (color == 3){
            System.out.println("Yellow");
        }else if (color == 4){
            System.out.println("Green");
        }else if (color == 5){
            System.out.println("Gay");
        }else if (color == 6){
            System.out.println("Blue");
        }else if (color == 7){
            System.out.println("Violet");
        }else {
            System.out.println("The color of the frightened nymph's thigh");
        }
    }
    private static void getTemperature(double temperature) {
        if (temperature > -5){
            System.out.println("Warm");
        }else if (temperature <= -5 && temperature > -20){
            System.out.println("Fine");
        }else {
            System.out.println("Cold");
        }
    }
    private static void integerNumOrNot(int num) {
        if (num==(num/num%2)){
            System.out.println("True: number is integer");
        }else{
            System.out.println("False: number is't integer");
        }
    }
    private static void getSeasonByIf(int numMonths) {
        if (numMonths <= 2 || numMonths == 12) {
            System.out.println("Winter");
        } else if (numMonths > 2 && numMonths <= 5) {
            System.out.println("Spring");
        } else if (numMonths > 5 && numMonths <= 8) {
            System.out.println("Summer");
        } else if (numMonths > 8 && numMonths <= 11) {
            System.out.println("Autumn");
        } else {
            System.out.println("Sorry please try another Number");
        }

    }
    private static void getSeason(int numMonths) {

        switch (numMonths){
            case 1, 2, 12:
                System.out.println("Winter");
                break;

            case 3, 4, 5:
                System.out.println("Spring");
                break;

            case 6, 7, 8:
                System.out.println("Summer");
                break;

            case 9, 10, 11:
                System.out.println("Autumn");
                break;

            default:
                System.out.println("mistake");
                break;

        }

    }

    //================================================ The second part ===============================================//

    private static void squaredNumber() {
        int n = 20;
        for(int i = 10; i<=n; i++){
            int result = i*i;
            System.out.println(result);
        }
    }
    private static void getTenFirstNumber() {
        for (int i = 0; i > -50; i = i -5){
            System.out.println(i);
        }
    }
    private static void loopWhile() {
        int number = 7;
        do {
            System.out.println( number );
            number = number + 7;
        }while (number < 98);
        System.out.println(number);

    }
    private static void getSumNumberLoop() {
        System.out.print("Please, enter your number: ");
        int number = new Scanner(System.in).nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
    private static void getNotInteger() {
        for (int i = 1; i < 99 ; i++){
            if (i % 2 != 0)
                System.out.println( i );
        }
    }
    private static void fromMoreToLess() {
        for (int i = 5; i >= 1; i--){
            System.out.println(i);
        }
    }

    //==================================================== Optional ==================================================//



}