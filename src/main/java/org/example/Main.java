package org.example;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //searchScannerLoop(scanner());
        int[] b = {2,3,4,5,6};
        System.out.println("put your number for seaech in array");
        searchArrayNumb(b, scanner().nextInt());


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

}