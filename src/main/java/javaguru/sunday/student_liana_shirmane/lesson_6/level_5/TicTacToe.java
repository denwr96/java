package main.java.javaguru.sunday.student_liana_shirmane.lesson_6.level_5;

//task19
//task20
//task21
//task22
//task23
//task24
//task25
//task27

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            if (field[i][1] == playerToCheck || field[i][2] == playerToCheck || field[i][3] == playerToCheck) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {        return true;

        }
        return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        if ((field[0][0] == playerToCheck || field[1][1] == playerToCheck || field[2][2] == playerToCheck) || (field[0][2] == playerToCheck || field[2][0] == playerToCheck)) {
            return true;
        }

        return false;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            if ((field[i][0] == playerToCheck) && (field[i][1] == playerToCheck) && (field[i][2] == playerToCheck)
                    || (field[0][i] == playerToCheck) && (field[1][i] == playerToCheck) && (field[2][i] == playerToCheck)
                    || (field[0][2] == playerToCheck) && (field[1][1] == playerToCheck) && (field[2][0] == playerToCheck)) {
                return true;
            }
        }
        return false;
    }

    public boolean isDrawPosition(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if(field[i][j] == -1){
                    return false;
                }
            }
        }
        return true;
    }

    public int[][] createField() {
        return new int[][]{{-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1}};
    }

    public Move getNextMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter X coordinate");
        int x = scanner.nextInt();
        System.out.println("Please enter Y coordinate");
        int y = scanner.nextInt();
        Move move = new Move(x, y);
        return move;
    }

    public void printFieldToConsole(int[][] field) {
        for (int[] row : field) {
            System.out.println(Arrays.toString(row));
        }
    }

    public void play() {
        int[][] field = createField();
        while (true) {
            printFieldToConsole(field);
            Move move0 = getNextMove();
            field[move0.getX()][move0.getY()] = 0;
            printFieldToConsole(field);
            if (isWinPosition(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }

            printFieldToConsole(field);
            Move move1 = getNextMove();
            field[move1.getX()][move1.getY()] = 1;
            printFieldToConsole(field);
            if (isWinPosition(field, 1)) {
                System.out.println("Player 1 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }
}
