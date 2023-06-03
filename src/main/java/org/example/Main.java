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

        //sortedBubble();
        sortedShake();
        //createNewArrayWithoutScanNumber(scanner());
        //createArrayWithScan(scanner());
        //differenceBetweenArray();

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
        int a = scanner().nextInt();
        int count = 0;
        for (int q : array){
            if (q == a){
                count++;
            }
        }
        if (count == 0){
            System.out.println("D'oh");
            return;
        }
        int[] finalArray = new int[array.length - count];
        int index = 0;
        for (int x = 0; x < array.length; x++){

            if (array[x] != a){
                finalArray[index++] = array[x];
            }

        }
        for (int o : finalArray) {
            System.out.print( o + " " );
        }
    }



    private static void createArrayWithScan(Scanner scanner){
        int[] array = new int[scanner().nextInt()];
        int x = 278;

        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * x );
            System.out.print( array[i] + " " );

        }
        /*int min = array[0];
        int max = array[0];
        int sum = array[0];
        for (int i = 1; i < array.length; i++ ){
            if (array[i] < min){
                min = array[i];
            }
            if (array[i] > max){
                max = array[i];
            }
            sum = sum + array[i];
        }
        System.out.println();
        System.out.println( "Мах: " + max );
        System.out.println( "Average: " + sum/array.length );
        System.out.println( "Мин: " + min );*/


        System.out.println();
        System.out.println( "Мах: " + Arrays.stream(array).max() );
        System.out.println( "Average: " + Arrays.stream(array).average());
        System.out.println( "Мин: " + Arrays.stream(array).min() );
    }


    private static void differenceBetweenArray() {
        int[] array = {1, 2, 3, 4, 5}; //3
        int[] array2 = {5, 6, 7, 8, 9}; //7
        int sumArray1 = 0;
        int sumArray2 = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            sumArray1 = array[i] + sumArray1;

        }

        System.out.println();
        System.out.print("this averageArray1: " + sumArray1/array.length);
        System.out.println();

        for (int x = 0; x < array2.length; x++) {
            System.out.print(array2[x] + " ");
            sumArray2 = array2[x] + sumArray2;
        }

        System.out.println();
        System.out.println("this averageArray2: " + sumArray2/array2.length);

        if (sumArray1 > sumArray2) {
            System.out.println("First Array bigger ");
        } else if (sumArray1 < sumArray2) {
            System.out.println("Second Array bigger");
        } else
            System.out.println(" First Array equals Second Array ");
    }



    private static void sortedBubble(){
        int[] array = { 300, 163, 184, 191, 174 };

        int lef = 0;
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;

            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    lef = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = lef;
                    isSorted = false;
                }
            }
        }
        for (int o : array){
            System.out.println(o + " ");
        }
    }

    private static void sortedShake(){
        int[] shake = { 300, 200, 100, 320,101 };

        int temp = 0;
        int leftSide = 0;
        int rightSide = shake.length - 1;

        do {

            for (int i = leftSide; i < rightSide; i++){
                if (shake[i] > shake[i + 1]){
                    temp = shake[i];
                    shake[i] = shake[i + 1];
                    shake[i + 1] = temp;
                }
            }
            rightSide--;

            for (int y = rightSide; y > leftSide; y--){
                if (shake[y] < shake[y -1] ){
                    temp = shake[y];
                    shake[y] = shake[y -1];
                    shake[y - 1] = temp;
                }
            }
            leftSide++;

        }while (leftSide < rightSide);
        for (int i: shake){
            System.out.println(i);
        }

    }

}