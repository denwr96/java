package main.java.javaguru.sunday.student_deniss_lobacs.lesson_6.homework.level_5_and_6;

import java.util.Scanner;

public class TicTacToe {

    //level_5.task19

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int i = 0; i < 3; i++) {
            boolean checkHorizontals = (field[i][0] == playerToCheck) && (field[i][1] == playerToCheck) && (field[i][2] == playerToCheck);
            if (checkHorizontals) {
                return true;
            }
        }
        return false;
    }

    //level_5.task20

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        for (int i = 0; i < 3; i++) {
            boolean checkVerticals = (field[0][i] == playerToCheck) && (field[1][i] == playerToCheck) && (field[2][i] == playerToCheck);
            if (checkVerticals) {
                return true;
            }
        }
        return false;
    }

    //level_5.task21

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        boolean checkFirstDiagonal = (field[0][0] == playerToCheck) && (field[1][1] == playerToCheck) && (field[2][2] == playerToCheck);
        boolean checkSecondDiagonal = (field[2][0] == playerToCheck) && (field[1][1] == playerToCheck) && (field[0][2] == playerToCheck);
        if (checkFirstDiagonal || checkSecondDiagonal) {
            return true;
        }
        return false;
    }

    //level_5.task22

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        boolean checkHorizontals = isWinPositionForHorizontals(field, playerToCheck);
        boolean checkVerticals = isWinPositionForVerticals(field, playerToCheck);
        boolean checkDiagonals = isWinPositionForDiagonals(field, playerToCheck);
        if (checkHorizontals || checkVerticals || checkDiagonals) {
            return true;
        }
        return false;
    }

    //level_5.task23

    public boolean isArrayContainEmptyFields(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == -1) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isDrawPosition(int[][] field) { //task23
        boolean checkFirstPlayer = !isWinPosition(field, 1);
        boolean checkSecondPlayer = !isWinPosition(field, 2);
        boolean checkEmptyFields = !isArrayContainEmptyFields(field);

        if (checkFirstPlayer && checkSecondPlayer && checkEmptyFields) {
            return true;
        }
        return false;
    }

    //level_6.task24

    public int[][] createField() {
        return new int[][]{{-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1}};
    }

    //level_6.task25

    public Move getNextMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter cordinates = ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        Move move = new Move(x, y);
        return move;
    }

    //level_6.task26

    public void printFieldToConsole(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }

    //level_6.task27

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