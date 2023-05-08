package org.example;


public class Main {
    public static void main(String[] args) {
        /*integerNumOrNot(2);
        getSeason(1);
        getSeasonByIf(2);
        getNumOfColour(8);*/
        getTemperature();

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
            System.out.println();
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
        if(numMonths==1){
            System.out.println("January");
        }else if (numMonths==2){
            System.out.println("February");
        }else if (numMonths==3){
            System.out.println("March");
        }else if (numMonths==4){
            System.out.println("April");
        }else if (numMonths==5){
            System.out.println("May");
        }else if (numMonths==6) {
            System.out.println("June");
        }else if (numMonths==7) {
            System.out.println("July");
        }else if (numMonths==8) {
            System.out.println("August");
        }else if (numMonths==9) {
            System.out.println("September");
        }else if (numMonths==10) {
            System.out.println("October");
        }else if (numMonths==11) {
            System.out.println("November");
        }else if (numMonths==12) {
            System.out.println("December");
        }

    }

    private static void getSeason(int numMonths) {

        switch (numMonths){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
        }

    }

    //================================================ The second part ===============================================//


}