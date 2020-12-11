package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_6;

// lesson_6 task_19
// lesson_6 task_20
// lesson_6 task_21
// lesson_6 task_22
// lesson_6 task_23
// lesson_6 task_24
// lesson_6 task_25
// lesson_6 task_26
// lesson_6 task_27

import java.util.Arrays;
import java.util.Scanner;

class TicTacToe {
    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int[] ints : field) {
            int counterPlayerOne = 0;
            int counterPlayerTwo = 0;
            for (int j = 0; j < field.length; j++) {
                if (ints[j] == 0) {
                    counterPlayerOne++;
                } else if (ints[j] == 1) {
                    counterPlayerTwo++;
                }
            }
            if (counterPlayerOne == field.length || counterPlayerTwo == field.length) {
                return true;
            }
        }

        return false;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            int counterPlayerOne = 0;
            int counterPlayerTwo = 0;
            for (int[] ints : field) {
                if (ints[i] == 0) {
                    counterPlayerOne++;
                } else if (ints[i] == 1) {
                    counterPlayerTwo++;
                }
            }
            if (counterPlayerOne == field.length || counterPlayerTwo == field.length) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        int counterPlayerOne = 0;
        int counterPlayerTwo = 0;
        for (int i = 0; i < field.length; i++) {
            if (field[i][i] == 0) {
                counterPlayerOne++;
            } else if (field[i][i] == 1) {
                counterPlayerTwo++;
            }
        }
        if (counterPlayerOne == field.length || counterPlayerTwo == field.length)
            return true;
        else if (counterPlayerOne != field.length || counterPlayerTwo != field.length) {
            counterPlayerOne = 0;
            counterPlayerTwo = 0;
            for (int i = 0; i < field.length; i++) {
                if (field[i][field.length - 1 - i] == 0) {
                    counterPlayerOne++;
                } else if (field[i][field.length - 1 - i] == 1) {
                    counterPlayerTwo++;
                }
            }
            return counterPlayerOne == field.length || counterPlayerTwo == field.length;
        }
        return false;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        if (isWinPositionForHorizontals(field, playerToCheck)) return true;
        if (isWinPositionForVerticals(field, playerToCheck)) return true;
        if (isWinPositionForDiagonals(field, playerToCheck)) return true;
        return false;
    }

    public boolean isDrawPosition(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == -1)
                    return false;
            }
        }if (!isWinPosition(field, 1) && !isWinPosition(field, 0))
                return false;
        return true;
    }

    public int[][] createField(int fieldLengthOne, int fieldLengthTwo) {
        int[][] field = new int[fieldLengthOne][fieldLengthTwo];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                field[i][j] = -1;
            }
        }
        return field;
    }

    public Move getNextMove() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter two coordinates (x,y)");
        System.out.println("Please enter x:");
        int x = myScanner.nextInt();
        System.out.println("Please enter y:");
        int y = myScanner.nextInt();
        Move move = new Move(x, y);
        return move;
    }

    public void printFieldToConsole(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public void play() {
        int[][] field = createField(3,3);
        while(true) {
            // printFieldToConsole(field);
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




