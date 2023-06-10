package org.example;

import java.util.Scanner;

import static org.example.Game.isBoardFull;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Game game = new Game();
        int row, col;
        boolean validInput;
        boolean endGame = false;

        while (!endGame) {
            game.printBoard();
            validInput = false;
            while (!validInput) {
                System.out.println("Player " + game.currentPlayerMark + ", enter your mark!");
                row = scan.nextInt() - 1;
                col = scan.nextInt() - 1;
                validInput = game.placeMark(row, col);
                if (!validInput) {
                    System.out.println("Bad choice. Try again.");
                }
            }

            if (game.checkForWin()) {
                System.out.println("Super! Player " + game.currentPlayerMark + " wins!");
                endGame = true;
            } else if (isBoardFull(game.board)) {
                System.out.println("No b wins!");
                endGame = true;
            } else {
                game.changePlayer();
            }
        }
        scan.close();
    }


}