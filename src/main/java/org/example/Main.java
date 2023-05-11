package org.example;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //searchScannerLoop(scanner());


    }

    private static Scanner scanner(){
        return new Scanner(System.in);
    }

    private static void searchScannerLoop(Scanner scanner){
        System.out.print("Please enter what number you want find? ");
        int[] newArray = { 1, 2, 3, 4, 5 };
        for (int i : newArray){
            if (scanner().nextInt() == i) {
                System.out.println("Yes, we found your number in this Array: " + i);
            }else {
                System.out.println("No in this Array don't this number ");
            }
            break;
        }
    }



}