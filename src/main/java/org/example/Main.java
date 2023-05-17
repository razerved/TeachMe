package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //tripleArray();
        chessFill();
    }


    private static Scanner scanner(){
        return new Scanner(System.in);
    }

    static void tripleArray(){
        int[][][] triple = new int[3][3][3];
        int number = scanner().nextInt();


        for (int outerDimension = 0; outerDimension < triple.length; outerDimension++)
        {
            for (int innerDimension = 0; innerDimension < triple[outerDimension].length; innerDimension++)
            {
                for (int finalDimension = 0; finalDimension < triple[outerDimension][innerDimension].length; finalDimension++)
                {
                    triple[outerDimension][innerDimension][finalDimension]=number;
                    System.out.print(triple[outerDimension][innerDimension][finalDimension] + " - ");
                }
                System.out.println();
            }
        }
    }


    static void chessFill() {
        char[][] chess = new char[8][8];
        char w = 'W';
        char b = 'B';

        for (int outer = 0; outer < chess.length; outer++) {

            for (int inner = 0; inner < chess[0].length; inner++) {
                if ((outer + inner) % 2 == 0) {
                    chess[inner][outer] = w;
                } else {
                    chess[inner][outer] = b;
                }
            }
        }


            for (int i = 0; i < chess.length; i++) {
                for (int j = 0; j < chess[0].length; j++) {
                    System.out.print(" " + chess[i][j] + " ");
                }
                System.out.println();
            }
        }


}