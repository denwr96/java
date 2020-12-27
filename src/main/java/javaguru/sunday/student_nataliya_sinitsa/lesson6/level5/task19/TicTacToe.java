package javaguru.sunday.student_nataliya_sinitsa.lesson6.level5.task19;

// Task 19 - Task 27

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Arrays;
import java.util.Scanner;

@CodeReview(approved = true)
class TicTacToe {

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        return field[0][0] == field[0][1] && field[0][2] == field[0][1] && field[0][0] == playerToCheck ||
                field[1][0] == field[1][1] && field[1][2] == field[1][1] && field[1][0] == playerToCheck ||
                field[2][0] == field[2][1] && field[2][2] == field[2][1] && field[2][0] == playerToCheck;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        return field[0][0] == field[1][0] && field[2][0] == field[1][0] && field[0][0] == playerToCheck ||
                field[0][1] == field[1][1] && field[2][1] == field[1][1] && field[0][1] == playerToCheck ||
                field[0][2] == field[1][2] && field[2][2] == field[1][2] && field[0][2] == playerToCheck;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        return field[0][0] == field[1][1] && field[2][2] == field[1][1] && field[0][0] == playerToCheck ||
                field[2][0] == field[1][1] && field[2][0] == field[0][2] && field[2][0] == playerToCheck;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        return isWinPositionForHorizontals(field, playerToCheck) || isWinPositionForVerticals(field, playerToCheck)
                || isWinPositionForDiagonals(field, playerToCheck);
    }

    public boolean isDrawPosition(int[][] field) {
        int sumOfUnusedPositions = 0;
        for (int[] ints : field) {
            for (int anInt : ints) {
                if (anInt == -1) {
                    sumOfUnusedPositions++;
                }
            }
        }
        return sumOfUnusedPositions == 1;
    }

    public int[][] createField() {
        int[][] field = new int[3][3];
        for (int[] ints : field) {
            Arrays.fill(ints, -1);
        }
    return field;
    }

    public Move getNextMove() {
        int x;
        int y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter X coordinate:");
        x = scanner.nextInt();
        System.out.println("Enter Y coordinate:");
        y = scanner.nextInt();
        return new Move(x, y);
    }

    public void printFieldToConsole(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == -1) {
                    System.out.print(field[i][j]);
                } else {
                    System.out.print(" " + field[i][j]);
                }
                if (j == 2) {
                    System.out.println(" ");
                }
            }
        }
    }

    public void play() {
        int[][] field = createField();
        while(true) {
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
