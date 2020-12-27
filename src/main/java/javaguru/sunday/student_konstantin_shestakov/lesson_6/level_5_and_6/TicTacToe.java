package javaguru.sunday.student_konstantin_shestakov.lesson_6.level_5_and_6;

// Task 19
// Task 20
// Task 21
// Task 22
// Task 23
// Task 24
// Task 25
// Task 26
// Task 27

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
class TicTacToe {

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {

        if (field[0][0] == playerToCheck && field[0][1] == playerToCheck && field[0][2] == playerToCheck ||
                field[1][0] == playerToCheck && field[1][1] == playerToCheck && field[1][2] == playerToCheck ||
                field[2][0] == playerToCheck && field[2][1] == playerToCheck && field[2][2] == playerToCheck) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {

        if (field[0][0] == playerToCheck && field[1][0] == playerToCheck && field[2][0] == playerToCheck ||
                field[0][1] == playerToCheck && field[1][1] == playerToCheck && field[2][1] == playerToCheck ||
                field[0][2] == playerToCheck && field[1][2] == playerToCheck && field[2][2] == playerToCheck) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {

        if (field[0][0] == playerToCheck && field[1][1] == playerToCheck && field[2][2] == playerToCheck ||
                field[0][2] == playerToCheck && field[1][1] == playerToCheck && field[2][0] == playerToCheck) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {

        if (isWinPositionForHorizontals(field, 0) || isWinPositionForVerticals(field, 0) || isWinPositionForDiagonals(field, 0)) {
            return true;
        } else {
            return false;
        }
    }


    public boolean isDrawPosition(int[][] field) {
        boolean draw = false;
        int sum = 0;

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                sum = sum + field[i][j];
                if (!isWinPosition(field, 0) && !isWinPosition(field, 1) && field[i][j] != -1 && sum == 4) {
                    draw = true;
                } else {
                    draw = false;
                }
            }
        }
        return draw;
    }

    public int[][] createField(int arrayLength1, int arrayLength2) {
        int[][] field = new int[arrayLength1][arrayLength2];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = -1;
            }
        }
        return field;
    }

    public Move getNextMove() {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        do {
            System.out.println("Enter X");
            x = scanner.nextInt();

            System.out.println("Enter Y");
            y = scanner.nextInt();
            if (x < 0 || x > 2 || y < 0 || y > 2) {
                System.out.println("Please enter coordinate within a valid range (0-2)");
            }
        } while (x < 0 || x > 2 || y < 0 || y > 2);

        Move move = new Move(x, y);
        return move;
    }

    public void printFieldToConsole(int[][] field) {
        System.out.println(field[0][0] + " | " + field[0][1] + " | " + field[0][2]);
        System.out.println(field[1][0] + " | " + field[1][1] + " | " + field[1][2]);
        System.out.println(field[2][0] + " | " + field[2][1] + " | " + field[2][2]);
    }

    public void play() {
        int[][] field = createField(3, 3);
        while (true) {
            printFieldToConsole(field);
            Move move0 = getNextMove();
            field[move0.getX()][move0.getY()] = 0;
//            printFieldToConsole(field);
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
//            printFieldToConsole(field);
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
