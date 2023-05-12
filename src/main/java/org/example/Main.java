package org.example;

import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //searchScannerLoop(scanner());

        /*int[] b = {2,3,4,5,6};
        System.out.println("put your number for search in array");
        searchArrayNumb(b, scanner().nextInt());*/


        //createNewArrayWithoutScanNumber(scanner());
        createArrayWithScan(scanner());

    }

    private static Scanner scanner(){
        return new Scanner(System.in);
    }

    private static void searchScannerLoop(Scanner scanner){
        System.out.print("Please enter what number you want find? ");
        int[] newArray = { 1, 2, 3, 4, 5 };
        int b = scanner().nextInt();
        for (int i : newArray){
            if ( b == i ) {
                System.out.println("Yes, we found your number in this Array: " );
                return;
            }
        }
        System.out.println("No in this Array don't this number ");
    }

    private static void searchArrayNumb(int[] array, int number){
        for (int i : array){
            if ( number == i ){
                System.out.println("yes");
                return;
            }
        }
        System.out.println("no");
    }



    private static void createNewArrayWithoutScanNumber(Scanner scanner){
        int[] array = { 1, 4, 3, 8, 5 };
        int[] finalArray = new int[5];
        int a = scanner().nextInt();
        for (int x = 0; x < array.length; x++){

            if (a == array[x]){
                continue;
            }

            finalArray[x] = array[x];
        }
        // TODO придумать отбивку в случае если в массиве " такого числа нет - выведите сообщения об этом "
        for (int o = 0; o < finalArray.length; o++) {
            System.out.println( finalArray[o] );
        }
    }



    private static void createArrayWithScan(Scanner scanner){
        int[] array = new int[scanner().nextInt()];
        int x = 278;
        for (int i = 0; i < array.length; i++ ){
            array[i] = (int)(Math.random() * x );
        }
        System.out.println( "Мах: " + Arrays.stream(array).max() );
        System.out.println( "Мин: " + Arrays.stream(array).min() );
    }


    private static void differenceBetweenArray(){

    }

}