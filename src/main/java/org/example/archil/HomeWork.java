package org.example.archil;

import java.util.Scanner;

public class HomeWork {
    static Scanner mas;
    public static void main(String[] args) {
        mas = new Scanner(System.in);

        getZoomArray();
        System.out.println();
        getChessArray();

        mas.close();
    }

    public static void getZoomArray() {
        System.out.println("Enter a nomber: ");

        int n = mas.nextInt();

        int[][][] cube = new int[][][]{
                {
                        {1, 2, 3},
                        {3, 2, 1},
                        {4, 5, 6}
                }
        };
        System.out.println("Basic array : ");

        for (int a = 0; a < cube.length; a++)
        {
            for (int b = 0; b < cube[a].length; b++)
            {
                for (int c = 0; c < cube[a][b].length; c++)
                {
                    System.out.print(cube[a][b][c] + "  " );
                }
                System.out.println();
            }
        }
        System.out.println("Magnified array : ");

        for (int a = 0; a < cube.length; a++)
        {
            for (int b = 0; b < cube[a].length; b++)
            {
                for (int c = 0; c < cube[a][b].length; c++)
                {
                    cube[a][b][c] = cube[a][b][c]+ n;
                    System.out.print(cube[a][b][c] + "  " );
                }
                System.out.println();
            }
        }
    }
    public static void getChessArray()
    {
        System.out.println("ChessArray");
        System.out.println();

        String[][] chess = new String[8][8];

        for (int a = 0; a < chess.length; a++)
        {
            for (int b = 0; b < chess[a].length; b++)
            {
                if (a % 2 == b % 2)
                {
                    chess[a][b] = "B";
                } else
                {
                    chess[a][b] = "W";
                }
                System.out.print(chess[a][b] + "  ");
            }
            System.out.println();
        }
    }
}